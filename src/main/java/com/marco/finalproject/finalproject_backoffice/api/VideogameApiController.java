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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marco.finalproject.finalproject_backoffice.models.Videogame;
import com.marco.finalproject.finalproject_backoffice.services.VideogameService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/videogames")
public class VideogameApiController {

    @Autowired
    private VideogameService videogameService;

    // INFO: READ
    @GetMapping
    public List<Videogame> index() {
        List<Videogame> videogames = videogameService.findAll();
        return videogames;
    }

    // INFO: SEARCH by name
    @GetMapping("/search")
    public List<Videogame> searchByName(@RequestParam String vgName) {
        List<Videogame> videogames = videogameService.searchByName(vgName);
        return videogames;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Videogame> show(@PathVariable int id) {
        Optional<Videogame> vgAttempt = videogameService.findById(id);
        if (vgAttempt.isEmpty()) {
            return new ResponseEntity<Videogame>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Videogame>(vgAttempt.get(), HttpStatus.OK);
    }

    @GetMapping("/slug/{slug}")
    public ResponseEntity<Videogame> show(@PathVariable String slug) {
        Optional<Videogame> vgAttempt = videogameService.findBySlug(slug);
        if (vgAttempt.isEmpty()) {
            return new ResponseEntity<Videogame>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Videogame>(vgAttempt.get(), HttpStatus.OK);
    }

    // INFO: CREATE
    @PostMapping
    public ResponseEntity<Videogame> store(@Valid @RequestBody Videogame videogame) {
        videogameService.create(videogame);
        return new ResponseEntity<Videogame>(videogame, HttpStatus.OK);
    }

    // INFO: UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Videogame> update(@Valid @RequestBody Videogame videogame, @PathVariable int id) {
        if (videogameService.existsById(id)) {
            videogame.setId(id);
            videogameService.create(videogame);
            return new ResponseEntity<Videogame>(videogame, HttpStatus.OK);
        }

        return new ResponseEntity<Videogame>(HttpStatus.NOT_FOUND);
    }

    // INFO: DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Videogame> delete(@PathVariable int id) {
        if (videogameService.existsById(id)) {
            videogameService.deleteById(id);
            return new ResponseEntity<Videogame>(HttpStatus.OK);
        }
        return new ResponseEntity<Videogame>(HttpStatus.NOT_FOUND);

    }
}
