package com.example.esprit.GestionMagasin.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.esprit.GestionMagasin.Model.Category;

import com.example.esprit.GestionMagasin.Repository.CategoryRepository;
import java.util.Date;
@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/magasin")
public class CategorieController {
@Autowired
private CategoryRepository categoryRepository;
@Autowired
private JdbcTemplate jdbcTemplate;
@Autowired
private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

@RequestMapping("/createCategory")
private  Category CreateCategroy(@RequestBody Category category)
{
	System.out.println("save category");
	return categoryRepository.save(category);
}


@PostMapping("/createCategoryJdbcTemplate")
private  int CreateCategroyJdbcTemplate(Long CATEGORY_ID,String CATEGORY_LIBELLE,Date CREATE_DATE )
{
	System.out.println("save category");
	return this.jdbcTemplate.update(
	        "insert into Category (CATEGORY_ID,CATEGORY_LIBELLE, CREATE_DATE) values (?,?, ?)", 
	        CATEGORY_ID,   CATEGORY_LIBELLE, CREATE_DATE);
}

@GetMapping("/GetAllCategories")
private List<Category> getAllCategorires()
{
	 System.out.println("query for list categories");
   /* List<Category>  listeCategory=jdbcTemplate.query(
             "SELECT CATEGORY_ID, CATEGORY_LIBELLE, CREATE_DATE FROM Category ",
             (rs, rowNum) -> new Category(rs.getLong("CATEGORY_ID"), rs.getString("CATEGORY_LIBELLE"), rs.getDate("CREATE_DATE"))
     );   
    return listeCategory;*/
	 return categoryRepository.findAll();
	

}
@GetMapping("/getCountCategories")
private Long getCountCategories()
{
	
	
	Long result =this.jdbcTemplate.queryForObject(
		    "SELECT COUNT(*) FROM Category", Long.class);
	System.out.println("number for categories:"+" "+result);
	return result;
	
}
//@GetMapping("/getCategoryById/{CATEGORY_ID}")
@RequestMapping("/getCategoryById/{CATEGORY_ID}")
private Optional<Category> getCategoryById(@PathVariable(value="CATEGORY_ID") Long CATEGORY_ID)
{
	return categoryRepository.findById(CATEGORY_ID);
	/*String sql="SELECT CATEGORY_LIBELLE FROM category WHERE CATEGORY_ID =: CATEGORY_ID";
	 SqlParameterSource namedParameters = new MapSqlParameterSource("CATEGORY_ID", CATEGORY_ID);
	 
	 return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, String.class);*/
}


}
