/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.education;

import com.argentina.programa.jwt.test.model.Education;
import com.argentina.programa.jwt.test.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class EducationService implements IEducationService{

    @Autowired 
    public EducationRepository eduRepo;
    
    @Override
    public List<Education> getEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void addEducation(Education educ) {
        eduRepo.save(educ);
    }

    @Override
    public void editEducation(Education educ) {
        eduRepo.save(educ);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }
    
}