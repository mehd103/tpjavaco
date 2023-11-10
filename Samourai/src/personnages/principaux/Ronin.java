package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur=1;
	
	
	public Ronin(String n, int a, String b) {
		super(n,a,b);
	}
	
	public void donner(int n, Commercant c) {
		this.perdreArgent(n);
		c.gagnerArgent(n);
		
	}
	
	public void provoquer(Yakuza y) {
		if ((honneur * 2)>= y.getReputation()) {
			gagnerArgent(y.perdreDuel());
			parler("YESSSS GAGNééééé");
		} else {
			honneur--;
			parler("zutttt perduuuuuuu!");
			y.gagnerDuel();
			
		}
	}

}
