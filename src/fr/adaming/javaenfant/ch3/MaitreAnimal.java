package fr.adaming.javaenfant.ch3;

public class MaitreAnimal {

	public static void main(String[] args) {
		
		 String réactionAnimal;	

		    AnimalFamilier monAnimal = new AnimalFamilier(); //Creation d'un objet à partir de la classe
		    monAnimal.manger(); //On appelle la méthode manger
		    réactionAnimal = monAnimal.dire("Cui !! Cui !!"); // on appelle la fonction dire
		    System.out.println(réactionAnimal);
		  
		    monAnimal.dormir();
		    
		    //Poisson 
		    Poisson monPetitPoisson = new Poisson();
		    String réactionPoisson = monPetitPoisson.dire("Salut");
		    System.out.println(réactionPoisson);
		    monPetitPoisson.dormir();
	}

}