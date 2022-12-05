/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.technology;

import com.argentina.programa.jwt.test.model.Technology;
import java.util.List;

public interface ITechnologyService {
   public List<Technology> getTechnologies();
   public void addTechnology(Technology techno);
   public void deleteTechnology(Long id);
   public void editTechnology(Technology techno);   
    
}
