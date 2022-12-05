/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.projects;

import com.argentina.programa.jwt.test.model.Projects;
import com.argentina.programa.jwt.test.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectService implements IProjectService{

    @Autowired
    public ProjectsRepository projectRepo;
    
    @Override
    public List<Projects> getProjects() {
        return projectRepo.findAll();
    }

    @Override
    public void addProject(Projects project) {
        projectRepo.save(project);
    }

    @Override
    public void editProject(Projects project) {
        projectRepo.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }
    
}
