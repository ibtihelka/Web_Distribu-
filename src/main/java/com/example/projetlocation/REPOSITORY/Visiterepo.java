package com.example.projetlocation.REPOSITORY;

import com.example.projetlocation.ENTITIES.Visite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Visiterepo extends JpaRepository<Visite,Long> {

    @Query("select c from Visite c where c.nom like :name")
    public Page<Visite> candidatByNom(@Param("name") String n, Pageable pageable);


}
