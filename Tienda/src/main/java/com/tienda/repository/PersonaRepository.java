/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elena
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{ //java generics y hace todas las consultas en la base de datos
    Persona findByNombre(String nombre);
}
