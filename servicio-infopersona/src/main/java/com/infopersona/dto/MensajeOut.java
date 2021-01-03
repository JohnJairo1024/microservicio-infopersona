package com.infopersona.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MensajeOut {

    //private String codigoRespuesta;
    private String mensaje;
    private Date fecha;
    private boolean exitoso;

}