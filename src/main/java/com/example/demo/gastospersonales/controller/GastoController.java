package com.example.demo.gastospersonales.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.gastospersonales.model.Gasto;
import com.example.demo.gastospersonales.service.GastoService;
@Controller
public class GastoController {

    @Autowired
    private GastoService service;

    @GetMapping("/")
    public String verLista(Model model) {
        model.addAttribute("gastos", service.listar());
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("gasto", new Gasto());
        return "form";
    }

    @PostMapping("/guardar")
    public String guardar(Gasto gasto) {
        service.guardar(gasto);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("gasto", service.obtener(id));
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/";
    }
}
