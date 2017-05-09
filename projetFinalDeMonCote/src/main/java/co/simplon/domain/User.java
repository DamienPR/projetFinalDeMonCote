package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String persoMail;
		
	private long pair;
	
	@OneToMany
	private List<Conclusion> conclusions;
	
	@OneToMany
	private List<Answer> answers;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name="promo_id")
	private Promo promo;
	
//	@OneToOne
//	private User pair;
}
