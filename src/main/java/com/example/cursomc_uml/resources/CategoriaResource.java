package com.example.cursomc_uml.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

    @RequestMapping(method =RequestMethod.GET )
    public String listar() {
        return "Rest is working";
    }
    
}
