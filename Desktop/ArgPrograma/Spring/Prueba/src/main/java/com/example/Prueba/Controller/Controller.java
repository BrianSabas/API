
package com.example.Prueba.Controller;

import com.example.Prueba.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    String resultado;
    
    List<Persona> listaPersonas = new ArrayList();
    
    @GetMapping("/suma/{nombre}")
    public String suma(@PathVariable String nombre) {
        int suma = 40+32;
         resultado = String.valueOf(suma);
           return "Hola " + nombre + " el resultado de tu suma es " + resultado;
    };
    
    @GetMapping("/hello")
    public String HelloWorld(@RequestParam String nombre){
        return "Hola " + nombre;
                
    };
    
    @PostMapping("/new/person")
    public void addPersona (@RequestBody Persona pers) {
        listaPersonas.add(pers);
    };
    
    
    @GetMapping("/getPersona/personas")
    @ResponseBody
   public List<Persona> getPersonas(){
       return listaPersonas;
   };
    
    
    
}
