
package com.argentina.programa.jwt.test.service.person;

import com.argentina.programa.jwt.test.model.Person;
import java.util.List;


public interface IPersonService {
    
    public List<Person> getPersons();
    public void addPerson(Person pers);
    public void deletePerson(Long id);
    
}