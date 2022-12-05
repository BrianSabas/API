/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.explaboral;

import com.argentina.programa.jwt.test.model.ExpLaboral;
import java.util.List;

public interface IExpLaboralService {
    
    public List<ExpLaboral> getExpLab();
    public void addExpLab(ExpLaboral expLab);
    public void editExpLab(ExpLaboral expLab);
    public void deleteExpLab(Long id);
    
}

