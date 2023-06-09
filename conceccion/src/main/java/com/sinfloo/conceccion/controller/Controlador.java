package com.sinfloo.conceccion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;



import com.sinfloo.conceccion.interfacesService.IpersonaService;
import com.sinfloo.conceccion.modelo.Persona;
@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas=service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
