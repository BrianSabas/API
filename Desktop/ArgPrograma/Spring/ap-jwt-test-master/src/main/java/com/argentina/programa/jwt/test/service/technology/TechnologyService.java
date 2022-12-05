/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.technology;

import com.argentina.programa.jwt.test.model.Technology;
import com.argentina.programa.jwt.test.repository.TechnologyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class TechnologyService implements ITechnologyService {

    @Autowired
    public TechnologyRepository technoRepo;
    
    @Override
    public List<Technology> getTechnologies() {
        return technoRepo.findAll();
    }

    @Override
    public void addTechnology(Technology techno) {
        technoRepo.save(techno);
    }

    @Override
    public void deleteTechnology(Long id) {
        technoRepo.deleteById(id);
    }

    @Override
    public void editTechnology(Technology techno) {
        technoRepo.save(techno);
    }
    
}

