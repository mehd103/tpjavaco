package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation=0;
	
	public Yakuza(String n, int a, String b, String c) {
		super(n,a,b);
		this.clan=c;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant c) {
		gagnerArgent(c.getArgent());
		c.seFaireExtorquer();
		parler("J'ai piqué le fric de " + c.getNom());
	}
	
	
	public int perdreDuel() {
		int b= getArgent();
		parler("oh nn j'ai perdu mon duel et mes " + b + "sous ! ");
		perdreArgent(b);
		reputation--;
		return b;
	}
	
	public void gagnerDuel() {
		parler("j'ai gagné yesss !");
		reputation++;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + getClan() );
	}
	
}
