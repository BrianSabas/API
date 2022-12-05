
package com.argentina.programa.jwt.test.service.person;

import com.argentina.programa.jwt.test.model.Person;
import com.argentina.programa.jwt.test.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService implements IPersonService {

    @Autowired
    public PersonRepository personRepo;
    
    @Override
    public List<Person> getPersons() {
      return personRepo.findAll();
    }

    @Override
    public void addPerson(Person pers) {
       personRepo.save(pers);
    }

    @Override
    public void deletePerson(Long id) {
        personRepo.deleteById(id);
        
    }
    
    
}