package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Role {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	private String name;
	
	@OneToMany
	private List<User> users;
	
	@OneToMany
	private List<Question> questions;
}
