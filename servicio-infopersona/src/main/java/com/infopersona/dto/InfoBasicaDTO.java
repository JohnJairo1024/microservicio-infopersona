package com.infopersona.dto;

import lombok.Data;

import java.util.Date;

@Data
public class InfoBasicaDTO extends MensajeOut {

    private Long identificacion;
    private String tipoIdentificacion;
    private Date fechaExpedicion;
    private String lugarExpedicion;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String genero;
    private String email;
    private String pais;
    private String departamento;
    private String municipio;
    private String estadoCivil;
    private String estrato;
    private String tipoSangre;
    private String eps;
}
