package com.example.Reclamation.Controller;


import com.example.Reclamation.Entity.Reclamation;
import com.example.Reclamation.Service.IReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/reclamation")
public class ReclamationRestAPI {
    @Autowired
    private IReclamationService iReclamationService;
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation){
        return  new ResponseEntity<>(iReclamationService.addReclamation(reclamation), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public  ResponseEntity<Reclamation>updateReclamation(@PathVariable(value = "id") int id ,
                                           @RequestBody Reclamation reclamation ){
        return new ResponseEntity<>(iReclamationService.updateReclamation(id , reclamation),HttpStatus.OK);
    }


}
