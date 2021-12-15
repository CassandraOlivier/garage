package fr.garage.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("fr.garage.app")
public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Vehicule vehicule = context.getBean(Voiture.class);
		vehicule.setCouleur("rouge");
		vehicule.setPoids((float) 50.2);
		System.out.println(vehicule);
	}
}
