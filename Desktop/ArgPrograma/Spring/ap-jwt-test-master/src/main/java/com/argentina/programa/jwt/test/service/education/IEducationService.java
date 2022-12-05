/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.education;

import com.argentina.programa.jwt.test.model.Education;
import java.util.List;

public interface IEducationService {
    public List<Education> getEducation();
    public void addEducation(Education educ);
    public void editEducation(Education educ);
    public void deleteEducation(Long id);
}
