package com.example.Reclamation.Service;

import com.example.Reclamation.Entity.Reclamation;


public interface IReclamationService {

    Reclamation addReclamation(Reclamation reclamation);
    Reclamation updateReclamation (int id , Reclamation newReclamation);
    String deleteReclamation(int id);
}
