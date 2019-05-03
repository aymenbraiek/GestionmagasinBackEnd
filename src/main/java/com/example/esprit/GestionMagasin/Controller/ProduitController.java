package com.example.esprit.GestionMagasin.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.esprit.GestionMagasin.Model.Produit;
import com.example.esprit.GestionMagasin.Model.Stock;
import com.example.esprit.GestionMagasin.Repository.CategoryRepository;
import com.example.esprit.GestionMagasin.Repository.ProduitRepository;
import com.example.esprit.GestionMagasin.exception.ResourceNotFoundException;
@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/magasin")
public class ProduitController {
@Autowired
private ProduitRepository produitRepository;
@Autowired
private JdbcTemplate jdbcTemplate;
@Autowired
private CategoryRepository categoryRepository;
@Autowired   
private StockController stockController;   

/* create produit with category*/
@PostMapping("/createProduit")
public Produit createProduit(@Valid @RequestBody Produit   produit) {
    return categoryRepository.findById(produit.getIdCategorie()).map(category -> {
        produit.setIdCategorie(category.getIdCategory());
        produit.setLibelleCategorie(category.getLibelleCategory());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = format.format( new Date());
        produit.setCreateAt(dateString);
        return produitRepository.save(produit);
      }).orElseThrow(() -> new ResourceNotFoundException(" idcategory" + produit.getIdProduit() + " not found"));
}
 /* get all product*/
@GetMapping("/GetAllProduit")
private List<Produit> getAllProduit()
{
	 System.out.println("query for list categories");
   
	 return produitRepository.findAll();
	

}  
@GetMapping("/ListProductWithCategory/{CATEGORIE_ID}")
public  List<Map<String,Object>> getAllProductCategory(@PathVariable(value="CATEGORIE_ID")Long CATEGORIE_ID)
{
	
	    return this.jdbcTemplate.queryForList("select * from Produit where CATEGORIE_ID=?",CATEGORIE_ID);
	    }


/* number for products*/
@GetMapping("/getCountProduits")
private Long getCountProduits()
{
	
	
	Long result =this.jdbcTemplate.queryForObject(
		    "SELECT COUNT(*) FROM Produit", Long.class);
	System.out.println("number for produits:"+" "+result);
	return result;
	
}

}
