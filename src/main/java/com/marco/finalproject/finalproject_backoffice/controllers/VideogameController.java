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

import com.marco.finalproject.finalproject_backoffice.models.Videogame;
import com.marco.finalproject.finalproject_backoffice.services.ConsoleService;
import com.marco.finalproject.finalproject_backoffice.services.VideogameService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/videogames")
public class VideogameController {
    // INFO: IMPORT Services
    @Autowired
    VideogameService videogameService;

    @Autowired
    ConsoleService consoleService;

    // INFO: CRUD
    // INFO: INDEX
    @GetMapping
    public String index(Model model) {
        List<Videogame> videogames = videogameService.findAll();
        model.addAttribute("videogames", videogames);
        return "videogames/index";
    }

    // INFO: SHOW
    @GetMapping("/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("videogame", videogameService.getById(id));
        return "videogames/show";
    }

    // INFO: DELETE
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        videogameService.deleteById(id);
        return "redirect:/videogames";
    }

    // INFO: SEARCH (ByName)
    @GetMapping("/search")
    public String search(@RequestParam(name = "vgName") String vgName, Model model) {
        model.addAttribute("videogames", videogameService.searchByName(vgName));
        return "videogames/index";
    }

    // INFO: CREATE & STORE
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("videogame", new Videogame());
        model.addAttribute("consoles", consoleService.findAll());
        return "videogames/create-or-edit";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("videogame") Videogame formVideogame, BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("consoles", consoleService.findAll());
            return "videogames/create-or-edit";
        }

        videogameService.create(formVideogame);
        return "redirect:/videogames";
    }

    // INFO: EDIT & UPDATE
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("videogame", videogameService.getById(id));
        model.addAttribute("consoles", consoleService.findAll());
        model.addAttribute("edit", true);
        return "videogames/create-or-edit";
    }

    @PostMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute("videogame") Videogame formVideogame, BindingResult bindingResult,
            Model model, @PathVariable int id) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("consoles", consoleService.findAll());
            return "videogames/create-or-edit";
        }

        videogameService.create(formVideogame);
        return "redirect:/videogames/" + id;
    }

}
