package com.example.annonce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/annonce")


public class AnnonceRestAPI {
    @Autowired
    private AnnonceService annonceService;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Annonce> createAnnonce(@RequestBody Annonce annonce) {
        return new ResponseEntity<>(annonceService.addAnnonce(annonce), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Annonce> updateAnnonce(@PathVariable(value = "id") int id,
                                                   @RequestBody Annonce annonce){
        return new ResponseEntity<>(annonceService.updateAnnonce(id, annonce),
                HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteAnnonce(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(annonceService.deleteAnnonce(id), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Annonce>> getAllAnnonces() {
        List<Annonce> annonces = annonceService.getAllAnnonces(); // Utilisation de l'instance annonceService
        if (annonces != null) {
            return new ResponseEntity<>(annonces, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
