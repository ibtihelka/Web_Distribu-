package com.example.projetlocation.CONTROLLER;

import com.example.projetlocation.ENTITIES.Visite;
import com.example.projetlocation.SERVICE.Visiteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("visite")
public class VisiteControlleur {

    @Autowired
    private Visiteservice visiteser;


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Visite> createCandidat(@RequestBody Visite visite) {
        return new ResponseEntity<>(visiteser.addvisite(visite), HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Visite>> getAllvisit() {
        List<Visite> organisation = visiteser.getAllVisites();
        if (organisation != null) {
            return new ResponseEntity<>(organisation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public ResponseEntity<Visite> getVisiteById(@PathVariable(value = "id") Long id) {
        Optional<Visite> visite = visiteser.getVisiteById(id);
        return visite.map(vis -> new ResponseEntity<>(vis, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Visite> updateCandidat(@PathVariable(value = "id") Long id,
                                                 @RequestBody Visite visite){
        return new ResponseEntity<>(visiteser.updateVisite(id, visite),
                HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") Long id){
        return new ResponseEntity<>(visiteser.deleteVisit(id), HttpStatus.OK);
    }
}