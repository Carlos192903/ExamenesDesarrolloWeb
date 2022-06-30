/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenDesarrolloweb.Examen.service;

import ExamenDesarrolloweb.Examen.entity.Lugares;
import ExamenDesarrolloweb.Examen.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class LugarService implements ILugarService {

    @Autowired
 private LugarRepository lugarRepository;
    @Override
    public List<Lugares> listLugares() {
        return (List<Lugares>) lugarRepository.findAll();
    }
}
