package co.simplon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Answer {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	private String content;
	
	@ManyToOne
	private User user;
}
