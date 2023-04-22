package com.sinfloo.conceccion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.conceccion.interfaces.Ipersona;
import com.sinfloo.conceccion.interfacesService.IpersonaService;
import com.sinfloo.conceccion.modelo.Persona;

@Service
public class PersonaService implements IpersonaService{

    @Autowired
    private Ipersona data;

    @Override
    public List<Persona> listar() {
         return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return null;
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
