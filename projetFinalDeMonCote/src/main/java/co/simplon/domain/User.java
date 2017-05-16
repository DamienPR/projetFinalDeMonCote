package co.simplon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String email;
	
	@OneToOne
	private User pair;
	
//	@OneToMany
//	private List<Conclusion> conclusions;
//	
//	@OneToMany
//	private List<Answer> answers;
	
	@ManyToOne
	private Role role;
	
	@ManyToOne
	private Promo promo;
}
