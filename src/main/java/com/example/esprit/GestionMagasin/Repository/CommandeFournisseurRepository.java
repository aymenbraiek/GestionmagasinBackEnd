package com.example.esprit.GestionMagasin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.GestionMagasin.Model.Commande_Fournisseur;


@Repository
public interface CommandeFournisseurRepository extends JpaRepository<Commande_Fournisseur, Long> {

}
