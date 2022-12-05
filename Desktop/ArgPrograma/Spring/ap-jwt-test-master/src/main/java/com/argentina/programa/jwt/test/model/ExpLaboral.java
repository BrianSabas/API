/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "explaboral" )
public class ExpLaboral implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreEmpresa;
    private String trabajoActual;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPerson")
    private Person person;
    
    public ExpLaboral() {
    };

    public ExpLaboral(Long id, String nombreEmpresa, String trabajoActual, String fechaInicio, String fechaFin, String descripcion, Person person) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.trabajoActual = trabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.person = person;
    }



    
    
    
}
