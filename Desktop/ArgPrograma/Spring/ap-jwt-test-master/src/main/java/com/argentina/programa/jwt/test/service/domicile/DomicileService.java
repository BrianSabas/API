/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.service.domicile;

import com.argentina.programa.jwt.test.model.Domicile;
import com.argentina.programa.jwt.test.repository.DomicileRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class DomicileService implements IDomicileService{

    @Autowired
    public DomicileRepository domicileRepo;
    
    @Override
    public List<Domicile> getDomicile() {
        return domicileRepo.findAll();
    }

    @Override
    public void addDomicile(Domicile domicile) {
        domicileRepo.save(domicile);
    }

    @Override
    public void editDomicile(Domicile domicile) {
        domicileRepo.save(domicile);
    }

    @Override
    public void deleteDomicile(Long id) {
        domicileRepo.deleteById(id);
    }
    
}

