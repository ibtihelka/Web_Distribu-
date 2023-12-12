package com.example.projetlocation.SERVICE;

import com.example.projetlocation.ENTITIES.Visite;
import com.example.projetlocation.REPOSITORY.Visiterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class Visiteservice {
    @Autowired
    private Visiterepo visiterepo;

    public Visite addvisite(Visite s){
        return visiterepo.save(s);
    }

    public Visite updateVisite(Long id, Visite newVisite) {
        if (visiterepo.findById(id).isPresent()) {
            Visite existingVisit = visiterepo.findById(id).get();
            existingVisit.setNom(newVisite.getNom());
            existingVisit.setPrenom(newVisite.getPrenom());
            existingVisit.setEmail(newVisite.getEmail());
            return visiterepo.save(existingVisit);
        } else
            return null;
    }


    public String deleteVisit(Long id) {
        if (visiterepo.findById(id).isPresent()) {
            visiterepo.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }


    public List<Visite> getAllVisites() {
        return visiterepo.findAll();
    }

    public Optional<Visite> getVisiteById(Long id) {
        return visiterepo.findById(id);
    }

}
