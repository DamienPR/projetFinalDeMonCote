package co.simplon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	private String content;
	
	@ManyToOne
	@JoinColumn(name="diary_id")
	private Diary diary;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
}
