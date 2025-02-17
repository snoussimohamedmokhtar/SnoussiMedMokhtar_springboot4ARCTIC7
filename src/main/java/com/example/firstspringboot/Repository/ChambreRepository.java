package com.example.firstspringboot.Repository;

import com.example.firstspringboot.Entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {

}
