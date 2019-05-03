package com.example.esprit.GestionMagasin.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.GestionMagasin.Model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	

}
