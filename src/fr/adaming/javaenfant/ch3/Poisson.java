package fr.adaming.javaenfant.ch3;

public class Poisson extends AnimalFamilier {
	int profondeurCourante = 0; // pour savoir la profondeur 
	// a laquelle le poisson plonge on initialise la variable une fois

	  public int plonger(int combienDePlus){
	    profondeurCourante = profondeurCourante + combienDePlus;
	    
	    
	    if (profondeurCourante > 100) {
	    	System.out.println("Je suis un petit " + "poisson et je ne peux pas plonger "
	    	+ "plus profond que 100 metres");
	    profondeurCourante = profondeurCourante - combienDePlus;
	    }
	    
	    else { 
	    	System.out.println("Plong�e de "+ combienDePlus + " metres");
	    	System.out.println("Je suis � " + profondeurCourante + " metres sous le niveau de la mer");
	    }
	    
	    return profondeurCourante ;
	  }
	  
	   /* System.out.println("Plong�e de " + combienDePlus + 
	    		" m�tres");
	    System.out.println("Je suis � " +profondeurCourante + 
	    		" m�tres sous le niveau de la mer");
	    return profondeurCourante; 
	  }*/
	  
      public String dire(String unMot) {
		  return "Ne sais-tu pas que les poissons ne parlent pas ?";
      }
  }
	  

