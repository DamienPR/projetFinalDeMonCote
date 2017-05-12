package co.simplon.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Promo {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	private String name;
	
	private Date startDate;
	
	private Date endDate;
	
//	@OneToMany
//	private List<User> users;
	
//	@OneToMany
//	private List<Diary> diaries;
}
