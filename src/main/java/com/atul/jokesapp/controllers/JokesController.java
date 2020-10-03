package com.atul.jokesapp.controllers;

import com.atul.jokesapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService service;

    public JokesController(JokesService service) {
        this.service = service;
    }

    @RequestMapping("/joke")
    public String  getJoke(Model model){
        model.addAttribute("joke",this.service.getJoke());
        return "joke";
    }
}
