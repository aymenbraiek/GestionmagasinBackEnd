package com.example.esprit.GestionMagasin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.GestionMagasin.Model.Fournisseur;
@Repository
public interface FournisseurRepository  extends JpaRepository<Fournisseur, Long>{

}
