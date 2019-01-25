package fr.adaming.javaenfant.ch3;

public class GameBoyAdvance {
	String typeCartouche;
	  int largeurEcran;
	  
public static void main(String[] args) {
	int x;
	int y;
	x = 5;
	y = x + 2;
	int y1= ++y;
	int monScore =5;
	monScore =monScore +1;
	
	System.out.println("x = "+x);
	System.out.println("y = "+y);
	System.out.println("monScore = "+monScore);
	
	//y+=2;
	System.out.println("y1 = "+y1);
	/*
	*monScore = monScore * 2; est équivalent à monScore *= 2;
	*monScore = monScore + 2; est équivalent à monScore += 2;
	*monScore = monScore - 2; est équivalent à monScore -= 2;
	*monScore = monScore / 2; est équivalent à monScore /= 2;
	*/
	monScore = monScore + 2;
	System.out.println("monScore etape1 on devrait avoir 8 = "+monScore);
	monScore +=2;
	System.out.println("monScore etape2 on devrait avoir 10 = "+monScore);
	monScore = monScore -2;
	System.out.println("monScore etape3 on devrait avoir 8= "+monScore);
	monScore -=2;
	System.out.println("monScore etape4 on devrait avoir 6 = "+monScore);
	monScore= monScore/2;
	System.out.println("monScore etape5 on devrait avoir 3= "+monScore);
	monScore /= 2; 
	System.out.println("monScore etape6 on devrait avoir 1 = "+monScore);
	
	char niveau = 'E';
	int chaises = 12;                            
	boolean sonActif = false;         
	double revenuNational = 23863494965745.78; 
	float prixJeu = 12.50f;      
	long totalVoitures = 4637283648392l; 
	
	System.out.println("niveau de type char = "+niveau);
	System.out.println("chaise de type int "+chaises);
	System.out.println("sonActif de type booleen "+ sonActif);
	System.out.println("revenuNational de type double "+ revenuNational);
	System.out.println("prixJeu de type float "+prixJeu);
	System.out.println("totalVoitures de type long = "+totalVoitures);
	
	//final String CAPITALE_ETAT = "Washington";
	
	
	int x1=1;
	int x3= x1++; // on inclus x1 dans x3 AVANT d'incrémenter
	int x2= +x1; //on inclus x1 dans x2 APRES incrémentation 
	System.out.println(x1+"x3="+x3);
	System.out.println(x1+"x2 ="+x2);
	}


	  void demarrerJeu() {
	  }
	  void arreterJeu() {
	  }

}
