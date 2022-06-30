/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExamenDesarrolloweb.Examen.repository;

import ExamenDesarrolloweb.Examen.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author carlo
 */
        @Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
    
}

