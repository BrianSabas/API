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
@Table(name = "education")
public class Education implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String careerFinished;
    private String careerName;
    private String highSchoolFinished;
    private String highSchoolName;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPerson")
    private Person person;
    
    public Education(){
    };

    public Education(Long id, String careerFinished, String careerName, String highSchoolFinished, String highSchoolName, Person person) {
        this.id = id;
        this.careerFinished = careerFinished;
        this.careerName = careerName;
        this.highSchoolFinished = highSchoolFinished;
        this.highSchoolName = highSchoolName;
        this.person = person;
    }

    


    
    
}
