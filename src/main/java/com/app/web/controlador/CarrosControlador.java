package com.app.web.controlador;


import com.app.web.servicio.CarrosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.web.entidad.Carros;


@Controller
public class CarrosControlador {

    @Autowired
    private CarrosServicio servicio;

        @GetMapping({ "/carros", "/" })
        public String listarCarros(Model modelo) {
            modelo.addAttribute("carros", servicio.listarTodosLosCarros());
            return "carros";
        }

    @GetMapping("/carros/nuevo")
    public String RegistrarCarro(Model modelo) {
        Carros Carros = new Carros();
        modelo.addAttribute("Carros", Carros);
        return "crear_estudiante";
    }
    }

