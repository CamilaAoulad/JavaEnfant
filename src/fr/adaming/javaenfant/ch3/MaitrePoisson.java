package fr.adaming.javaenfant.ch3;

public class MaitrePoisson {

	public static void main(String[] args) {
		Poisson monPoisson = new Poisson();
		
	    monPoisson.plonger(2);
	    monPoisson.plonger(97);
	    monPoisson.plonger(3);
			
	    
	    String réactionPoisson = monPoisson.dire("Salut");
	    System.out.println(réactionPoisson);
	    monPoisson.dormir();
	    
	    
	}

}
