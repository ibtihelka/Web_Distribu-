package com.example.annonce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceService {
    @Autowired
    private AnnonceRepository annonceRepository;

    public Annonce addAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    public Annonce updateAnnonce(int id, Annonce newAnnonce) {
        if (annonceRepository.findById(id).isPresent()) {
            Annonce existingAnnonce = annonceRepository.findById(id).get();
            existingAnnonce.setAdresse(newAnnonce.getAdresse());
            existingAnnonce.setTelephone(newAnnonce.getTelephone());
            existingAnnonce.setDetail(newAnnonce.getDetail());
            return annonceRepository.save(existingAnnonce);
        } else
            return null;
    }
    public String deleteAnnonce(int id) {
        if (annonceRepository.findById(id).isPresent()) {
            annonceRepository.deleteById(id);
            return "annonce supprimé";
        } else
            return "annonce non supprimé";
    }
}
