package com.infopersona.service;


import com.infopersona.dto.InfoBasicaDTO;
import com.infopersona.dto.MensajeOut;
import com.infopersona.entity.InfoBasica;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InfoBasicaService {

    List<InfoBasica> findAll();

    InfoBasica findById(Long id);

    ResponseEntity<MensajeOut> guardar(InfoBasicaDTO infoBasicaDTO);

    void deleteById(Long id);

    void auditoria(String servicio);
}
