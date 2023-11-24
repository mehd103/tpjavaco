package personnages.secondaires;
import personnages.Humain;

import java.util.Random;

public class GrandMere extends Humain {
	
	private Humain [] memoire = new Humain [30];
	private int nbconnaissance= 0;

	public GrandMere(String n) {
		super(n, 0, "tisane");
	}
	
	
	private String humainHasard() {
		Random random = new Random();
        int choix = random.nextInt(4); 
        switch (choix) {
            case 0:
                return "Commerçant";
            case 1:
                return "Ronin";
            case 2:
                return "Samouraï";
            case 3:
                return "Traître";
            default:
                return "Inconnu"; 
        }
    }
	
	public void faireConnaissanceAvec(Humain humain) {
		memoire[nbconnaissance]=humain;
		nbconnaissance++;
	}
	
	public void ragoter() {
		for (int i=0; i<nbconnaissance;i++) {
			   if (memoire[i] instanceof Traitre) {
				   parler("je sais que " + memoire[i].getNom() + "est un Traitre");
				   
			   } else {
				   parler("je crois que " + memoire[i].getNom() + "est un Ronin");
				   
			   }
			}
	}
}	
