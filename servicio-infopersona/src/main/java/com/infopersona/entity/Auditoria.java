package com.infopersona.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "auditoria")
@Data
public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1285454306356845809L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String servicio;
    private String descripcion;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

}
