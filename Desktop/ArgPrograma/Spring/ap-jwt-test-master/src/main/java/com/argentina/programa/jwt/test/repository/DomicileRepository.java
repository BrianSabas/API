/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentina.programa.jwt.test.repository;

import com.argentina.programa.jwt.test.model.Domicile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicileRepository extends JpaRepository<Domicile, Integer> {

    public void deleteById(Long id);
    
}
