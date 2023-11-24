package personnages.principaux;
import personnages.Humain;

public class Samourai extends Ronin {
	
	private String seigneur;

	public Samourai(String n, int a, String b, String s) {
		super(n, a, b);
		this.seigneur=s;
	}
	
	public void Boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je sers le seigneur" + this.seigneur);
	}
	
	public void combattre(Humain h) {
		
		
	}
}
