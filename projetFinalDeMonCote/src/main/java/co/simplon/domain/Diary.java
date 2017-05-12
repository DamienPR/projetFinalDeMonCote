package co.simplon.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Diary {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	private String name;
	
	private Date startDate;
	
	private Date endDate;
	
	private String introduction;
	
	@OneToMany
	//(mapped by="")
	private List<Question> questions;
	
	@OneToMany
	//(mapped by="") utilisé uniquement en relation unidirectionnelle
	private List<Conclusion> conclusions;
	
	@ManyToOne
	private Promo promo;
}
