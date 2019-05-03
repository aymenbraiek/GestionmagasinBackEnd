package com.example.esprit.GestionMagasin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.esprit.GestionMagasin.Controller.CategorieController;
import com.example.esprit.GestionMagasin.Controller.Commande_FournisseurController;
import com.example.esprit.GestionMagasin.Controller.ProduitController;

import com.example.esprit.GestionMagasin.Model.Produit;
import com.example.esprit.GestionMagasin.Repository.CategoryRepository;
import com.example.esprit.GestionMagasin.Repository.CommandeFournisseurRepository;
import com.example.esprit.GestionMagasin.Repository.FournisseurRepository;
import com.example.esprit.GestionMagasin.Repository.ProduitRepository;


@SpringBootApplication
public class GestionMagasinApplication  implements CommandLineRunner{
@Autowired
private JdbcTemplate jdbcTemplate;
@Autowired
private CategoryRepository categoryRepository;
@Autowired
private ProduitRepository produitRepository;
@Autowired
private CategorieController categorieController;
@Autowired   
private FournisseurRepository fournisseurRepository;
@Autowired
private Commande_FournisseurController commande_FournisseurController;
@Autowired
private CommandeFournisseurRepository commandeFournisseurRepository;
@Autowired
private ProduitController produitController; 

	public static void main(String[] args) {
		SpringApplication.run(GestionMagasinApplication.class, args);
	}
     
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Category category=new Category();
		category.setLibelleCategory("informatique");
		category.setCreateAt(new Date());
		categoryRepository.save(category);*/
		/*Produit produit=new Produit();
	
		produit.setLibelle("s9");
		produit.setIdCategorie(1L);  
		produit.setLibelleCategorie("informatique");
		
	    produitController.createProduit(produit);
	    */
	
		/*Commande_Fournisseur commande_Fournisseur=new Commande_Fournisseur();
		commande_Fournisseur.setCreateAt(new Date().toString());
		commande_Fournisseur.setIdProduit(3L);
		commande_Fournisseur.setIdFournisseur(38L);
		commande_Fournisseur.setQte(30L);
		commande_FournisseurController.createCommande_Fournisseur(commande_Fournisseur);*/
		
	/*	Fournisseur fournisseur=new Fournisseur();
		fournisseur.setLibelleFournisseur("wincom");
		fournisseur.setDateCreaction(new Date());
		fournisseurRepository.save(fournisseur);*/
		/*this.jdbcTemplate.update(
		        "insert into Category (CATEGORY_ID,CATEGORY_LIBELLE, CREATE_DATE) values (?,?, ?)", 
		    3,   "Stockage", new Date());
		this.jdbcTemplate.update(
		        "insert into Category (CATEGORY_ID,CATEGORY_LIBELLE, CREATE_DATE) values (?,?, ?)", 
		    4,   "Réseau", new Date());
		this.jdbcTemplate.update(
		        "insert into Category (CATEGORY_ID,CATEGORY_LIBELLE, CREATE_DATE) values (?,?, ?)", 
		    5,   "tv-Son-Photos", new Date());*/
	
	/*    List<Map<String,Object>> maps=    produitController.getAllProductCategory(1L);
	    for (Map<String, Object> map : maps) {
	        for (Map.Entry<String, Object> entry : map.entrySet()) {
	        	String key = entry.getKey();
	            Object value = entry.getValue();
	            if(value.equals("informatique"))
	            {
	            	System.out.println("ok");
	            }
	           
	        }*/
   
		
	}

	}
