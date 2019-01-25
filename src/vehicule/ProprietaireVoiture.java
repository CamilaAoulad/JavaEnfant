package vehicule;

public class ProprietaireVoiture {
public static void main(String[] args) {
	Voiture Voiture = new Voiture();
	VoitureJamesBond bolide = new VoitureJamesBond();
	Voiture.demarrer();
	
	int resultatdistance = Voiture.rouler(20);
	System.out.println("la voiture a parcouru "+ resultatdistance + " km" );
	Voiture.arreter();
	
	bolide.demarrer();
	int distanceJB = bolide.rouler(20);
	System.out.println("la voiture de James Bond a parcouru "+ distanceJB + " km" );

	bolide.arreter();
}
}
