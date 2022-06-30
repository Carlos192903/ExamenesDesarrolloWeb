/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExamenDesarrolloweb.Examen.service;

import ExamenDesarrolloweb.Examen.entity.Persona;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IPersonaService {
    public  List<Persona> getALLPersona();
    public Persona getPersonaById (long id);
    public void savePersona(Persona persona);
    public void delete (long id); 
}
