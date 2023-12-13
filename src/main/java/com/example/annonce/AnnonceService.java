package com.example.annonce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    public List<Annonce> getAllAnnonces() {
        return annonceRepository.findAll();
    }

    /*public Visite addvisite(Visite s){
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


    public List<Annonce> getAllAnnonces() {
        return annoncerepository.findAll();
    }

    public Optional<Visite> getVisiteById(Long id) {
        return visiterepo.findById(id);
    }

}*/
}
