package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class User {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	private String firstname;
	
	private String lastname;
	
	private String password;
	
	private String email;

// manque une annotation car boucle lors de requete GET
	@OneToOne
	private User pair;
	
	@ManyToOne
	private Role role;
	
	@ManyToOne
	private Promo promo;
	
	@OneToMany
	private List<Conclusion> conclusions;
}
