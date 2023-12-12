package com.example.Reclamation.Repository;

import com.example.Reclamation.Entity.Reclamation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamationRepo extends JpaRepository<Reclamation,Integer> {
   // @Query("select r from Reclamation  where r.objet like :name")
   // public Page<Reclamation> ByNom(@Param("name") String n , Pageable pageable);

}
