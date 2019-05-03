package com.example.esprit.GestionMagasin.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.esprit.GestionMagasin.Model.Commande_Fournisseur;
import com.example.esprit.GestionMagasin.Model.Fournisseur;
import com.example.esprit.GestionMagasin.Model.Produit;
import com.example.esprit.GestionMagasin.Model.Stock;
import com.example.esprit.GestionMagasin.Repository.CommandeFournisseurRepository;
import com.example.esprit.GestionMagasin.Repository.FournisseurRepository;
import com.example.esprit.GestionMagasin.Repository.ProduitRepository;
import com.example.esprit.GestionMagasin.Repository.StockRepository;
import com.example.esprit.GestionMagasin.exception.ResourceNotFoundException;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/magasin")
public class Commande_FournisseurController {
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired   
	private FournisseurRepository fournisseurRepository;
	@Autowired
	private CommandeFournisseurRepository commande_FournisseurController;
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private StockController stockController;
	
	@PostMapping("/createCommande_Fournisseur")
	public Commande_Fournisseur createCommande_Fournisseur(@Valid @RequestBody Commande_Fournisseur commande_Fournisseur) {
	   return  produitRepository.findById(commande_Fournisseur.getIdProduit()).map(produit -> {
		   System.out.println("produit"+" "+produit);
	    	commande_Fournisseur.setIdProduit(produit.getIdProduit());
	    	commande_Fournisseur.setLibelleProduit(produit.getLibelle());
	    	
	    	SimpleDateFormat	format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String dateString = format.format( new Date()); 
	        commande_Fournisseur.setCreateAt(dateString);
	  
	        Fournisseur fournisseur=fournisseurRepository.findById(commande_Fournisseur.getIdFournisseur()).orElse(null);
	        if(fournisseur!=null)
	        {
	        	System.out.println("Fournisseur"+" "+fournisseur);
	        	commande_Fournisseur.setIdFournisseur(fournisseur.getIdFournisseur());
	        	commande_Fournisseur.setLibelleFournisseur(fournisseur.getLibelleFournisseur());
	        }
	       return commande_FournisseurController.save(commande_Fournisseur);
	    }).orElseThrow(() -> new ResourceNotFoundException(" idcategory" + commande_Fournisseur.getIdProduit() + " not found"));
	  
	}
	/* get all commandes fournissuer*/
	@GetMapping("/getallCommande_Fournisseur")
	private List<Commande_Fournisseur> getAllCommandes()
	{
		System.out.println("get all commandes frournisseur");
		return commande_FournisseurController.findAll();
	}
	/* get by id commande fournisseur*/
	@GetMapping("/getallCommande_FournisseurById/{idCommande_fournisseur}")
	private Commande_Fournisseur getAllCommandesById(@PathVariable(value="idCommande_fournisseur") Long idCommande_fournisseur)
	{
		System.out.println("get all commandes frournisseur by id");
		return commande_FournisseurController.findById(idCommande_fournisseur).orElseThrow(() -> new ResourceNotFoundException(" idcategory" + idCommande_fournisseur + " not found"));
	}
}
