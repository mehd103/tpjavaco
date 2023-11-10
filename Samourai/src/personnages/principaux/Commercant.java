package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String n, int a) {
		super(n,a, "thé");
		
	}
	
	public int seFaireExtorquer() {
		int b = getArgent();
		perdreArgent(b);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return b;
	}
	
	public void recevoir(int n) {
		gagnerArgent(n);
		
	}

}
