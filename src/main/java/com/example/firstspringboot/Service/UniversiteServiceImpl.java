package com.example.firstspringboot.Service;

import com.example.firstspringboot.Entity.Universite;
import com.example.firstspringboot.Repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository UniversiteRepository;
    public List<Universite> retrieveAllUniversites() {
        return UniversiteRepository.findAll();
    }
    public Universite retrieveUniversite(Long universiteId) {
        return UniversiteRepository.findById(universiteId).get();
    }
    public Universite addUniversite(Universite u) {
        return UniversiteRepository.save(u);
    }
    public void removeUniversite(Long universiteId) {
        UniversiteRepository.deleteById(universiteId);
    }
    public Universite modifyUniversite(Universite universite) {
        return UniversiteRepository.save(universite);
    }
}
