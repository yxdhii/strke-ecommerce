package com.productos.productos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping({"/", "/inicio"})
    public String mostrarPaginaPrincipal() {
        return "pages/pagina-principal";
    }

    @GetMapping("/pagina-productos")
    public String mostrarPaginaProductos() {
        return "pages/pagina-productos";
    }

    @GetMapping("/pagina-contacto")
    public String mostrarPaginaContacto() {
        return "pages/pagina-contacto";
    }

    @GetMapping("/pagina-registro")
    public String mostrarPaginaRegistro() {
        return "pages/pagina-registro";
    }

    @GetMapping("/pagina-login")
    public String mostrarPaginaLogin() {
        return "pages/pagina-login";
    }

    @GetMapping("/pagina-nosotros")
    public String mostrarPaginaNosotros() {
        return "pages/pagina-nosotros";
    }

    // ====== ZAPATILLAS ======
    @GetMapping("/zapatillas/running/model1")
    public String mostrarRunningModel1() {
        return "features/zapatillas/running/zapatilla-running-model1";
    }

    @GetMapping("/zapatillas/casual/model1")
    public String mostrarCasualModel1() {
        return "features/zapatillas/casual/zapatilla-casual-model1";
    }

    @GetMapping("/zapatillas/training/model1")
    public String mostrarTrainingModel1() {
        return "features/zapatillas/training/zapatilla-training-model1";
    }
}
