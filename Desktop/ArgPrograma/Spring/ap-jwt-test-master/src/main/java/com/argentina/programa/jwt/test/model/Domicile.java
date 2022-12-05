/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "domicile")
public class Domicile implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String localidad;
   private String address;
   
   
   public Domicile(){
   };

    public Domicile(Long id, String localidad, String address) {
        this.id = id;
        this.localidad = localidad;
        this.address = address;
    }
   
   
   
    
}