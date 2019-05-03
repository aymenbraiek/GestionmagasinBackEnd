package com.example.esprit.GestionMagasin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.GestionMagasin.Model.CommandeClient;


@Repository
public interface CommandeClientRepository  extends JpaRepository<CommandeClient, Long>{

}
