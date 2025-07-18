package com.marco.finalproject.finalproject_backoffice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marco.finalproject.finalproject_backoffice.models.Console;
import com.marco.finalproject.finalproject_backoffice.services.ConsoleService;

@Controller
@RequestMapping("/consoles")
public class ConsoleController {

    @Autowired
    private ConsoleService consoleService;

    // INFO: CRUD
    // INFO: INDEX

    @GetMapping
    public String index(Model model) {
        List<Console> consoles = consoleService.findAll();
        model.addAttribute("consoles", consoles);
        return "consoles/index";
    }

    // INFO: SHOW
    @GetMapping("/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("console", consoleService.getById(id));
        return "consoles/show";
    }
}
