package co.simplon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetFinalDeMonCoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetFinalDeMonCoteApplication.class, args);
	}
}



//Transfert front back
//
//1
//@requestparam pour get ou post en parametre pour envoyer une valeur, notemment pour le controller login de springsecurity
//
//2
//@RequestBody pour post un objet, il faut créer un objet en js avant
//
//3
//@PathVariable pour get ou post une valeur, on peut mettre plusieurs données d'affilée
//
//Tout ce qui est dans l'url est un get
