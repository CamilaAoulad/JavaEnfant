package fr.adaming.javaenfant.ch3;

public class MaitreAnimal {

	public static void main(String[] args) {
		
		 String r�actionAnimal;	

		    AnimalFamilier monAnimal = new AnimalFamilier(); //Creation d'un objet � partir de la classe
		    monAnimal.manger(); //On appelle la m�thode manger
		    r�actionAnimal = monAnimal.dire("Cui !! Cui !!"); // on appelle la fonction dire
		    System.out.println(r�actionAnimal);
		  
		    monAnimal.dormir();
		    
		    //Poisson 
		    Poisson monPetitPoisson = new Poisson();
		    String r�actionPoisson = monPetitPoisson.dire("Salut");
		    System.out.println(r�actionPoisson);
		    monPetitPoisson.dormir();
	}

}