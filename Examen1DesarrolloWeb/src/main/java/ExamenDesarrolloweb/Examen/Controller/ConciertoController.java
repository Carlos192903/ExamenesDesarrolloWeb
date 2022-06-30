/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenDesarrolloweb.Examen.Controller;

import ExamenDesarrolloweb.Examen.entity.Lugares;
import ExamenDesarrolloweb.Examen.entity.Persona;
import ExamenDesarrolloweb.Examen.service.ILugarService;
import ExamenDesarrolloweb.Examen.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author carlo
 */
         @Controller
public class ConciertoController {
 


    @Autowired
    private IPersonaService personaService;
    @Autowired
    private ILugarService lugarService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getALLPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        //retorna el html 
        return "personas";

    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<Lugares> listaPaises = lugarService.listLugares();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "Crear";

    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaService.savePersona(persona);

        return "redirect:/persona";
    }

    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {
        Persona persona = personaService.getPersonaById(idPersona);
        List<Lugares> listaPaises = lugarService.listLugares();
        model.addAttribute("persona", persona);
        model.addAttribute("paises", listaPaises);
        return "Crear";
    }

    @GetMapping("/delete/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona) {
        personaService.delete(idPersona);

        return "redirect:/persona";
    }

}
  

