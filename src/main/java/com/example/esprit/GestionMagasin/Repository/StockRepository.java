package com.example.esprit.GestionMagasin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.GestionMagasin.Model.Stock;


@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {

}
