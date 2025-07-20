package com.ProyectoGian.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HolaMundo")
public class HolaMundoController {

    @GetMapping("/mañana")
    public String HolaMundoMañana(){
        return "Hola, buenos dias, como amaneciste?";
    }

    @GetMapping("/tarde")
    public String HolaMundoTarde(){
        return "Hola, buneas tardes, ya almorzaste?";
    }

    @GetMapping("/noche")
    public String HolaMundoNoche(){
        return "Hola, buenas noches, ya en cama?";
    }

}
