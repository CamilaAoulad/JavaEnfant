package vehicule;

public class Voiture {

	public void demarrer() {
		System.out.println("la voiture demarre vroum vroum");
	}
	
	public void arreter() {
		System.out.println("la voiture s'arrete stop ");
	}
	public int rouler(int duree) {
		
		int distance = duree *60;
		return distance;
		
	}
		 
}