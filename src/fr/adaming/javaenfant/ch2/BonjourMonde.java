package fr.adaming.javaenfant.ch2;

public class BonjourMonde { // class commence par une majuscule

	public static void main(String[] args) {  
		System.out.println("Bonjour Monde");
		adresse(40, "rue Mariotte",59000,"Lille");
		//int x; 
		//int y; 
		//x =5;
		//y= x+2;
		//System.out.println(x+" "+y);
		// TODO Auto-generated method stub

	}
public static void adresse( int numero, String rue,int CP, String Ville) // methode donc commence avec une minuscule 
{ 
	System.out.println( "J'habite au :");
	System.out.println( numero + " "+ rue + " ");
	System.out.println(CP+" "+ Ville);
}
}
