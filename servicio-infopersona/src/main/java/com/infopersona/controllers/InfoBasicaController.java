package com.infopersona.controllers;


import com.infopersona.dao.InfoBasicaDao;
import com.infopersona.dto.InfoBasicaDTO;
import com.infopersona.dto.MensajeOut;
import com.infopersona.entity.InfoBasica;
import com.infopersona.service.InfoBasicaService;
import com.infopersona.util.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class InfoBasicaController {

    @Autowired
    private InfoBasicaService infoBasicaService;


    @Autowired
    private InfoBasicaDao infoBasicaDao;

    @GetMapping("/infopersona")
    public List<InfoBasica> listar() {
        return infoBasicaService.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/infopersona/{id}")
    public InfoBasicaDTO detalle(@PathVariable Long id) {
        InfoBasica infoBasica = infoBasicaService.findById(id);
        InfoBasicaDTO mensajeOut = new InfoBasicaDTO();
        mensajeOut.setExitoso(true);
        if (infoBasica == null) {
            mensajeOut.setMensaje(Constantes.CodigoRespuesta.FALLIDO.toString());
            mensajeOut.setExitoso(false);
            mensajeOut.setFecha(new Date());
            return mensajeOut;
        }
        mensajeOut.setIdentificacion(infoBasica.getIdentificacion());
        mensajeOut.setTipoIdentificacion(infoBasica.getTipoIdentificacion());
        mensajeOut.setFechaExpedicion(infoBasica.getFechaExpedicion());
        mensajeOut.setLugarExpedicion(infoBasica.getLugarExpedicion());
        mensajeOut.setLugarExpedicion(infoBasica.getLugarExpedicion());
        mensajeOut.setNombre(infoBasica.getNombre());
        mensajeOut.setPrimerApellido(infoBasica.getPrimerApellido());
        mensajeOut.setSegundoApellido(infoBasica.getSegundoApellido());
        mensajeOut.setFechaNacimiento(infoBasica.getFechaNacimiento());
        mensajeOut.setGenero(infoBasica.getGenero());
        mensajeOut.setEmail(infoBasica.getEmail());
        mensajeOut.setPais(infoBasica.getPais());
        mensajeOut.setDepartamento(infoBasica.getDepartamento());
        mensajeOut.setMunicipio(infoBasica.getMunicipio());
        mensajeOut.setEstadoCivil(infoBasica.getEstadoCivil());
        mensajeOut.setEstrato(infoBasica.getEstrato());
        mensajeOut.setTipoSangre(infoBasica.getTipoSangre());
        mensajeOut.setEps(infoBasica.getEps());
        return mensajeOut;
    }

    @PostMapping("/infopersona/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<MensajeOut> guardar(@RequestBody InfoBasicaDTO infoBasicaDTO) {
        return infoBasicaService.guardar(infoBasicaDTO);
    }

    @PostMapping("/infopersona/auditoria")
    @ResponseStatus(HttpStatus.CREATED)
    public void auditoria(@RequestParam String servicio) {
        infoBasicaService.auditoria(servicio);
    }


    @PutMapping("/infopersona/editar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public InfoBasica editar(@RequestBody InfoBasicaDTO infoBasicaDTO, @PathVariable Long id) {
        InfoBasica infoBasic = infoBasicaService.findById(id);
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
        return infoBasicaDao.save(infoBasic);
    }

    @DeleteMapping("/infopersona/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        infoBasicaService.deleteById(id);
    }

}
