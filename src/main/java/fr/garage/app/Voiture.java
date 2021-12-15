package fr.garage.app;

import org.springframework.stereotype.Component;

@Component
public class Voiture extends Vehicule {
	
	public Voiture() {
		super();
	}

	public Voiture(String couleur, float poids) {
		super();
		this.couleur = couleur;
		this.poids = poids;
	}
	
	public String toString() {
		return "Voiture [couleur=" + couleur + ", poids=" + poids + "]";
	}
	
	
		
}
