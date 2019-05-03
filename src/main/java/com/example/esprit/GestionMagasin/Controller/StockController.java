package com.example.esprit.GestionMagasin.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.esprit.GestionMagasin.Model.Commande_Fournisseur;
import com.example.esprit.GestionMagasin.Model.Produit;
import com.example.esprit.GestionMagasin.Model.Stock;
import com.example.esprit.GestionMagasin.Repository.ProduitRepository;
import com.example.esprit.GestionMagasin.Repository.StockRepository;
import com.example.esprit.GestionMagasin.exception.ResourceNotFoundException;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/magasin")
public class StockController {
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private ProduitRepository produitRepository;
	
	public void  createStock(Produit produit) {
		Stock stock=new Stock();
		SimpleDateFormat	format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = format.format( new Date()); 
        stock.setCreateAt(dateString);
        stock.setIdProduit(produit.getIdProduit());
        stock.setLibelleProduit(produit.getLibelle());
        stock.setQuatite(0L);
        
        
        
	  
	  
	}

}
