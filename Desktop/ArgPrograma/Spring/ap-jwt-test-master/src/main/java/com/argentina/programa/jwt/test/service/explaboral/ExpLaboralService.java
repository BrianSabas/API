
package com.argentina.programa.jwt.test.service.explaboral;

import com.argentina.programa.jwt.test.model.ExpLaboral;
import com.argentina.programa.jwt.test.repository.ExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class ExpLaboralService implements IExpLaboralService{
    
    @Autowired
    public ExpLaboralRepository expLabRepo;

    @Override
    public List<ExpLaboral> getExpLab() {
        return expLabRepo.findAll();
    }

    @Override
    public void addExpLab(ExpLaboral expLab) {
        expLabRepo.save(expLab);
    }

    @Override
    public void editExpLab(ExpLaboral expLab) {
        expLabRepo.save(expLab);
    }

    @Override
    public void deleteExpLab(Long id) {
        expLabRepo.deleteById(id);
    }
    
}
