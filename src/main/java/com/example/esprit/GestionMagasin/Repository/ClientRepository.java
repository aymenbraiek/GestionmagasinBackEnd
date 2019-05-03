package com.example.esprit.GestionMagasin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.GestionMagasin.Model.Category;
import com.example.esprit.GestionMagasin.Model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	Category save(Category category);

}
