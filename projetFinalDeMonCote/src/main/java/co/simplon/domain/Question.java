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
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	private String content;
	
	@ManyToOne
	private Diary diary;
	
	@ManyToOne
	private Role role;
	
	//relation unidirectionnelle qui permet de récupérer les réponses aux questions uniquement
	@OneToOne
	private Answer answer;
}
