package com.example.firstspringboot.Service;
import com.example.firstspringboot.Entity.Chambre;
import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
// Here we will add later methods calling keywords and methods calling JPQL
}
