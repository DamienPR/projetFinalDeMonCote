package co.simplon.domain;

import java.security.Timestamp;
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
public class Promo {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	
	private String name;
	
	private Timestamp startDate;
	
	private Timestamp endDate;
	
	@OneToMany
	private List<User> users;
	
	@OneToMany
	private List<Diary> diaries;
}
