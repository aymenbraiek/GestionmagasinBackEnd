package com.example.esprit.GestionMagasin.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.esprit.GestionMagasin.Model.Client;
import com.example.esprit.GestionMagasin.Repository.ClientRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/magasin")
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	
	 @Autowired
	  JdbcTemplate jdbcTemplate;
	 
	 @RequestMapping("/createClient")
	private Client CreateClient(@RequestBody Client client)
	{
		  
		System.out.println("save client");
		return clientRepository.save(client);
	}

@RequestMapping("/GetAllClients")
private List<Client> getAllClient()
{
	 System.out.println("query for list client");
    List<Client>  listeClient=jdbcTemplate.query(
             "SELECT idClient, name, lastName,adresse,tel FROM Client ",
             (rs, rowNum) -> new Client(rs.getLong("idClient"), rs.getString("name"), rs.getString("lastName"),rs.getString("adresse"),rs.getLong("tel"))
     );
    return listeClient;
	

}
@RequestMapping("/getCountClient")
private Long getCountClient()
{
	Long result =this.jdbcTemplate.queryForObject(
		    "SELECT COUNT(*) FROM Client", Long.class);
	return result;
}
	
	 
}
