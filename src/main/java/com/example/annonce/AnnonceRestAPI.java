package com.example.annonce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/annonce")
public class AnnonceRestAPI {
    @Autowired
    private AnnonceService annonceService;
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Annonce> createAnnonce(@RequestBody Annonce annonce) {
        return new ResponseEntity<>(annonceService.addAnnonce(annonce), HttpStatus.OK);
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Annonce> updateAnnonce(@PathVariable(value = "id") int id,
                                                   @RequestBody Annonce annonce){
        return new ResponseEntity<>(annonceService.updateAnnonce(id, annonce),
                HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteAnnonce(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(annonceService.deleteAnnonce(id), HttpStatus.OK);
    }
    
}
