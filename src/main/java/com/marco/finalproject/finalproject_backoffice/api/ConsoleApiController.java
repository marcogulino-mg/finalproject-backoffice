package com.marco.finalproject.finalproject_backoffice.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marco.finalproject.finalproject_backoffice.models.Console;
import com.marco.finalproject.finalproject_backoffice.services.ConsoleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/consoles")
public class ConsoleApiController {

    @Autowired
    private ConsoleService consoleService;

    // INFO: READ
    @GetMapping
    public List<Console> index() {
        List<Console> consoles = consoleService.findAll();
        return consoles;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Console> show(@PathVariable int id) {
        Optional<Console> consoleAttempt = consoleService.findById(id);
        if (consoleAttempt.isEmpty()) {
            return new ResponseEntity<Console>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Console>(consoleAttempt.get(), HttpStatus.OK);
    }

    @GetMapping("/slug/{slug}")
    public ResponseEntity<Console> show(@PathVariable String slug) {
        Optional<Console> consoleAttempt = consoleService.findBySlug(slug);
        if (consoleAttempt.isEmpty()) {
            return new ResponseEntity<Console>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Console>(consoleAttempt.get(), HttpStatus.OK);
    }

    // INFO: CREATE
    @PostMapping
    public ResponseEntity<Console> store(@Valid @RequestBody Console console) {
        consoleService.create(console);
        return new ResponseEntity<Console>(console, HttpStatus.OK);
    }

    // INFO: UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Console> update(@Valid @RequestBody Console console, @PathVariable int id) {
        if (consoleService.existsById(id)) {
            console.setId(id);
            consoleService.create(console);
            return new ResponseEntity<Console>(console, HttpStatus.OK);
        }

        return new ResponseEntity<Console>(HttpStatus.NOT_FOUND);
    }

    // INFO: DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Console> delete(@PathVariable int id) {
        if (consoleService.existsById(id)) {
            consoleService.deleteById(id);
            return new ResponseEntity<Console>(HttpStatus.OK);
        }
        return new ResponseEntity<Console>(HttpStatus.NOT_FOUND);

    }
}
