package com.example.annonce;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {
    /*@Query("select a from Annonce a where a.adresse like :adresse")
    public Page<Annonce> annonceByAdresse(@Param("adresse") String ad, Pageable pageable);*/
}

