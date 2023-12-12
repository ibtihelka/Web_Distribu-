package com.example.Reclamation.Service;

import com.example.Reclamation.Entity.Reclamation;
import com.example.Reclamation.Repository.ReclamationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class IReclamationServiceImp implements IReclamationService{

    @Autowired
    ReclamationRepo reclamationRepo;


    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return reclamationRepo.save(reclamation);

        //return userRepo.save(user)
    }

    @Override
    public Reclamation updateReclamation(int id, Reclamation newReclamation) {
        if (reclamationRepo.findById(id).isPresent()){
            Reclamation existingReclation =reclamationRepo.findById(id).get();
            existingReclation.setObjet(newReclamation.getObjet());
            existingReclation.setDescription(newReclamation.getDescription());
            return reclamationRepo.save(existingReclation);
        }
        else{
        return null;}
    }


    @Override
    public String deleteReclamation(int id) {
        if (reclamationRepo.findById(id).isPresent()){
            reclamationRepo.deleteById(id);
            return "reclamation supprimé";
        }
        else {
        return "Reclamation non supprimé";}
    }

}
