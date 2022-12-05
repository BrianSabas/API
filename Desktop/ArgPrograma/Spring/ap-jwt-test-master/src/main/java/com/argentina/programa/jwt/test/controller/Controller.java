
package com.argentina.programa.jwt.test.controller;

import com.argentina.programa.jwt.test.model.Domicile;
import com.argentina.programa.jwt.test.model.Education;
import com.argentina.programa.jwt.test.model.ExpLaboral;
import com.argentina.programa.jwt.test.model.Person;
import com.argentina.programa.jwt.test.model.Projects;
import com.argentina.programa.jwt.test.model.Technology;
import com.argentina.programa.jwt.test.service.domicile.IDomicileService;
import com.argentina.programa.jwt.test.service.education.IEducationService;
import com.argentina.programa.jwt.test.service.explaboral.IExpLaboralService;
import com.argentina.programa.jwt.test.service.person.IPersonService;
import com.argentina.programa.jwt.test.service.projects.IProjectService;
import com.argentina.programa.jwt.test.service.technology.ITechnologyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @Autowired
    private IPersonService PersonSvc;
    private IEducationService EducationSvc;
    private IDomicileService DomicileSvc;
    private ITechnologyService TechnologySvc;
    private IProjectService ProjectSvc;
    private IExpLaboralService ExpLaboralSvc;
    
    @PostMapping("/new/person")
    public void addPerson(@RequestBody Person pers){
        PersonSvc.addPerson(pers);
    };
    
    @ResponseBody
    @GetMapping("/get/persons")
    public List<Person> getPersons(){
    return PersonSvc.getPersons();
    };
    
    @DeleteMapping("/delete/person/{id}")
    public void deletePerson(@PathVariable long id) {
        PersonSvc.deletePerson(id);
    };
   
    
    
    
    @PostMapping("/new/education")
    public void addEducation(@RequestBody Education edu) {
        EducationSvc.addEducation(edu);
    };
    
    @PutMapping("/edit/education")
    public void editEducation(@RequestBody Education edu){
        EducationSvc.editEducation(edu);
    }
    
    @ResponseBody
    @GetMapping("/get/education")
    public List<Education> getEducation(){
        return EducationSvc.getEducation();
    }
    
    @DeleteMapping("/delete/education/{id}")
    public void deleteEducation(@PathVariable long id){
        EducationSvc.deleteEducation(id);
    }
    
    
    
    
    @PostMapping("/new/domicile")
    public void addDomicile(@RequestBody Domicile domicile){
        DomicileSvc.addDomicile(domicile);
    }
    
    @PutMapping("/edit/domicile")
    public void editDomicile(@RequestBody Domicile domicile){
        DomicileSvc.editDomicile(domicile);
    }
    
    @ResponseBody
    @GetMapping("/get/domicile") 
    public List<Domicile> getDomicile(){
        return DomicileSvc.getDomicile();
    }
    
    @DeleteMapping("/delete/domicile/{id}")
    public void deleteDomicile(@PathVariable long id){
           DomicileSvc.deleteDomicile(id);
    }
    
    
    
    
    @PostMapping("/new/technology")
    public void addTechnology(@RequestBody Technology techno){
        TechnologySvc.addTechnology(techno);
    }

    @PutMapping("/edit/technology")
    public void editTechnology(@RequestBody Technology techno){
        TechnologySvc.editTechnology(techno);
    }
    
    @ResponseBody
    @GetMapping("/get/technologies")
    public List<Technology> getTechnologies() {
       return TechnologySvc.getTechnologies();
    }
    
    @DeleteMapping("/delete/technology/{id}")
    public void deleteTechnology(@PathVariable long id) {
        TechnologySvc.deleteTechnology(id);
    }
        
    
    
    
    @PostMapping("/new/project")
    public void addProject(@RequestBody Projects project){
        ProjectSvc.addProject(project);
    }
    
    @PutMapping("edit/project")
    public void editProject(@RequestBody Projects project) {
        ProjectSvc.editProject(project);
    }
    
    @ResponseBody
    @GetMapping("/get/projects")
    public List<Projects> getProjects(){
         return ProjectSvc.getProjects();
    }
    
    @DeleteMapping("/delete/project/{id}")
    public void deleteProject(@PathVariable long id) {
        ProjectSvc.deleteProject(id);
    }
    
    
    
    
    @PostMapping("/new/experiencia laboral")
    public void addExpLab(@RequestBody ExpLaboral expLab){
        ExpLaboralSvc.addExpLab(expLab);
    }
    
    @PutMapping("/edit/experiencia laboral")
    public void editExpLab(@RequestBody ExpLaboral expLab){
        ExpLaboralSvc.editExpLab(expLab);
    }
        
    @ResponseBody
    @GetMapping("/get/experiencias laborales")
    public List<ExpLaboral> getExpLab(){
        return ExpLaboralSvc.getExpLab();
    }
    
    @DeleteMapping("/delete/experiencia laboral/{id}")
    public void deleteExpLab(@PathVariable long id) {
        ExpLaboralSvc.deleteExpLab(id);
    }           
    
}
