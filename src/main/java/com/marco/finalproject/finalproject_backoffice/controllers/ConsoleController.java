package com.marco.finalproject.finalproject_backoffice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marco.finalproject.finalproject_backoffice.models.Console;
import com.marco.finalproject.finalproject_backoffice.services.ConsoleService;

import jakarta.validation.Valid;

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

    // INFO: SEARCH (ByName)
    @GetMapping("/search")
    public String search(@RequestParam(name = "consoleName") String consoleName, Model model) {
        model.addAttribute("consoles", consoleService.searchByName(consoleName));
        return "consoles/index";
    }

    // INFO: DELETE
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        consoleService.deleteById(id);
        return "redirect:/consoles";
    }

    // INFO: CREATE & STORE
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("console", new Console());
        return "consoles/create-or-edit";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("console") Console formConsole, BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            return "consoles/create-or-edit";
        }

        consoleService.create(formConsole);
        return "redirect:/consoles";
    }

    // INFO: EDIT & UPDATE
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("console", consoleService.getById(id));
        model.addAttribute("edit", true);
        return "consoles/create-or-edit";
    }

    @PostMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute("console") Console formConsole, BindingResult bindingResult,
            Model model, @PathVariable int id) {
        if (bindingResult.hasErrors()) {
            return "consoles/create-or-edit";
        }

        consoleService.create(formConsole);
        return "redirect:/consoles/" + id;
    }
}
