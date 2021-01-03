package com.infopersona.service;

import com.infopersona.dao.AuditoriaDao;
import com.infopersona.dao.InfoBasicaDao;
import com.infopersona.dto.InfoBasicaDTO;
import com.infopersona.dto.MensajeOut;
import com.infopersona.entity.Auditoria;
import com.infopersona.entity.InfoBasica;
import com.infopersona.util.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@Service
public class InfoBasicaServicesImpl implements InfoBasicaService {

    private static final Logger LOGGER = Logger.getLogger(InfoBasicaServicesImpl.class.getName());

    @Autowired
    private InfoBasicaDao infoBasicaDao;

    @Autowired
    private AuditoriaDao auditoriaDao;


    @Transactional(readOnly = true)
    public List<InfoBasica> findAll() {
        String servicio = Constantes.SERVICIO_CONSULTA_GENERAL;
        auditoria(servicio);
        return (List<InfoBasica>) infoBasicaDao.findAll();
    }


    @Transactional(readOnly = true)
    public InfoBasica findById(Long id) {
        String servicio = Constantes.SERVICIO_CONSULTA_ID;
        auditoria(servicio);
        return infoBasicaDao.findById(id).orElse(null);
    }

    /**
     * @param infoBasicaDTO
     * @return
     */
    public ResponseEntity<MensajeOut> guardar(InfoBasicaDTO infoBasicaDTO) {
        MensajeOut mensajeOut = new MensajeOut();

        if (infoBasicaDTO.getIdentificacion() == null) {
            //seteamos el mensaje fallido
            mensajeOut.setMensaje(Constantes.CodigoRespuesta.FALLIDO.toString());
            mensajeOut.setExitoso(false);
            mensajeOut.setFecha(new Date());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensajeOut);
        }

        String servicio = Constantes.SERVICIO_CONSULTA_GUARDAR;
        auditoria(servicio);

        InfoBasica infoBasic = new InfoBasica();
        infoBasic.setIdentificacion(infoBasicaDTO.getIdentificacion());
        infoBasic.setTipoIdentificacion(infoBasicaDTO.getTipoIdentificacion());
        infoBasic.setFechaExpedicion(infoBasicaDTO.getFechaExpedicion());
        infoBasic.setLugarExpedicion(infoBasicaDTO.getLugarExpedicion());
        infoBasic.setLugarExpedicion(infoBasicaDTO.getLugarExpedicion());
        infoBasic.setNombre(infoBasicaDTO.getNombre());
        infoBasic.setPrimerApellido(infoBasicaDTO.getPrimerApellido());
        infoBasic.setSegundoApellido(infoBasicaDTO.getSegundoApellido());
        infoBasic.setFechaNacimiento(infoBasicaDTO.getFechaNacimiento());
        infoBasic.setGenero(infoBasicaDTO.getGenero());
        infoBasic.setEmail(infoBasicaDTO.getEmail());
        infoBasic.setPais(infoBasicaDTO.getPais());
        infoBasic.setDepartamento(infoBasicaDTO.getDepartamento());
        infoBasic.setMunicipio(infoBasicaDTO.getMunicipio());
        infoBasic.setEstadoCivil(infoBasicaDTO.getEstadoCivil());
        infoBasic.setEstrato(infoBasicaDTO.getEstrato());
        infoBasic.setTipoSangre(infoBasicaDTO.getTipoSangre());
        infoBasic.setEps(infoBasicaDTO.getEps());
        infoBasicaDao.save(infoBasic);

        //seteamos el mensaje exitoso
        mensajeOut.setMensaje(Constantes.CodigoRespuesta.EXITOSO.toString());
        mensajeOut.setExitoso(true);
        mensajeOut.setFecha(new Date());
        return ResponseEntity.status(HttpStatus.OK).body(mensajeOut);
    }


    @Transactional
    public void deleteById(Long id) {
        String servicio = Constantes.SERVICIO_CONSULTA_ELIMINAR;
        auditoria(servicio);
        infoBasicaDao.deleteById(id);
    }

    /**
     * @param servicio
     */
    @Async
    public void auditoria(String servicio) {
        try {
            Thread.sleep(10000);
            LOGGER.info("Se igresa al metodo de auditoria {}");
            Auditoria auditoria = new Auditoria();
            auditoria.setServicio(servicio);
            auditoria.setDescripcion(Constantes.SERVICIO_CONSULTA_AUDITORIA);
            auditoria.setFechaRegistro(new Date());
            auditoriaDao.save(auditoria);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
