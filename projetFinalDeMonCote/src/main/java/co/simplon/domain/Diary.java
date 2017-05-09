package co.simplon.domain;

import java.security.Timestamp;
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
public class Diary {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	private String name;
	
	private Timestamp startDate;
	
	private Timestamp endDate;
	
	private String introduction;
	
	@OneToMany
	private List<Question> questions;
	
	@OneToMany
	private List<Conclusion> conclusions;
	
	@ManyToOne
	@JoinColumn(name = "promo_id")
	private Promo promo;
}
