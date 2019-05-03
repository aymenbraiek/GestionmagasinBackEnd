package com.example.esprit.GestionMagasin.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.esprit.GestionMagasin.Model.Fournisseur;
import com.example.esprit.GestionMagasin.Repository.FournisseurRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/magasin")
public class FournisseurController {
	private FournisseurRepository fournisseurRepository;
	
	@GetMapping("/GetAllFournisseur")
	private List<Fournisseur> getAllFournisseurs()
	{System.out.println("query for list categories");
	 return fournisseurRepository.findAll();
		}
	
	
	@RequestMapping("/createFournisseur")
	private Fournisseur CreateFournissuer(@RequestBody Fournisseur fournisseur )
	{
		  
		System.out.println("CreateFournissuer");
		return fournisseurRepository.save(fournisseur);
	}

}
