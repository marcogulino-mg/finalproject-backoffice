package com.marco.finalproject.finalproject_backoffice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marco.finalproject.finalproject_backoffice.models.Videogame;
import com.marco.finalproject.finalproject_backoffice.services.VideogameService;

@Controller
@RequestMapping("/videogames")
public class VideogameController {
    // INFO: IMPORT Services
    @Autowired
    VideogameService videogameService;

    // INFO: CRUD
    // INFO: INDEX
    @GetMapping
    public String index(Model model) {
        List<Videogame> videogames = videogameService.findAll();
        model.addAttribute("videogames", videogames);
        return "videogames/index";
    }
}
