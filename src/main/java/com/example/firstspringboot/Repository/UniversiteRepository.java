package com.example.firstspringboot.Repository;

import com.example.firstspringboot.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {

}
