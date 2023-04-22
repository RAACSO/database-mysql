package com.sinfloo.conceccion.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.conceccion.modelo.Persona;

@Repository
public interface Ipersona  extends CrudRepository<Persona, Integer> {
    
}
