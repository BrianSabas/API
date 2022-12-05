/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.projects;

import com.argentina.programa.jwt.test.model.Projects;
import java.util.List;

public interface IProjectService {
    
    public List<Projects> getProjects();
    public void addProject(Projects project);
    public void editProject(Projects project);
    public void deleteProject(Long id);
}

