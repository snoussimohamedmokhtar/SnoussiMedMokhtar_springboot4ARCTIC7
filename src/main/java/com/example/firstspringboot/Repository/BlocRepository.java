package com.example.firstspringboot.Repository;

import com.example.firstspringboot.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc, Long> {

}
