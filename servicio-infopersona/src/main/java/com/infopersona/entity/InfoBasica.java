package com.infopersona.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "infobasica_persona")
@Data
public class InfoBasica implements Serializable {

    private static final long serialVersionUID = 1285454306356845809L;

    @Id
    private Long identificacion;
    private String tipoIdentificacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_expedicion")
    private Date fechaExpedicion;
    private String lugarExpedicion;

    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento")
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


    public InfoBasica() {
    }

    public InfoBasica(Long identificacion, String tipoIdentificacion, Date fechaExpedicion, String lugarExpedicion, String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String genero, String email, String pais, String departamento, String municipio, String estadoCivil, String estrato, String tipoSangre, String eps) {
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.fechaExpedicion = fechaExpedicion;
        this.lugarExpedicion = lugarExpedicion;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.email = email;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
        this.estadoCivil = estadoCivil;
        this.estrato = estrato;
        this.tipoSangre = tipoSangre;
        this.eps = eps;
    }
}
