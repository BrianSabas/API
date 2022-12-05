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
@Table(name = "person" )
public class Person implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String tel;
    private String aboutMe;
    private String email;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "IdDomicile")
    private Domicile domicile;
    
    public Person() {
    };

    public Person(Long id, String name, String surname, String tel, String aboutMe, String email, Domicile domicile) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.aboutMe = aboutMe;
        this.email = email;
        this.domicile = domicile;
    }
}