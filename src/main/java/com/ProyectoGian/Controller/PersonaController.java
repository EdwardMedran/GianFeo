package com.ProyectoGian.Controller;

import com.ProyectoGian.Entity.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Persona")
public class PersonaController {

    ArrayList personas = new ArrayList();

    @PostMapping
    public String agregarPersona(@RequestBody Persona persona){
        personas.add(persona);
        return "Se agrego una persona correctamente";
    }

    @GetMapping
    public ArrayList<Persona> obtenerPersona(){
        return personas;
    }

}
