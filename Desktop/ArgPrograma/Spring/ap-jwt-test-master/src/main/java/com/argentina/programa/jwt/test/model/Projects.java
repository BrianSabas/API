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
@Table(name = "projects" )
public class Projects implements Serializable {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String aboutProject;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idTechnology")
    private Technology technology;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idPerson")
    private Person person;
    
    public Projects(){
    };

    public Projects(Long id, String projectName, String aboutProject, Technology technology, Person person) {
        this.id = id;
        this.projectName = projectName;
        this.aboutProject = aboutProject;
        this.technology = technology;
        this.person = person;
    }
  
    
}