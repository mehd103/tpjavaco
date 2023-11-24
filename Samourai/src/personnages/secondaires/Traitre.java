package personnages.secondaires;
import personnages.principaux.*;
import personnages.Humain;

public class Traitre extends Samourai {

	private int traitrise=0;
	
	public Traitre(String n, int a, String b, String s) {
		super(n, a, b, s);

	}
	
	public void extorquer(Commercant c) {
		if (traitrise>=3) {
			parler("peut plus extorquer (t=3)");
		}else {
			gagnerArgent(c.getArgent());
			c.seFaireExtorquer();
			parler("J'ai piqué le fric de " + c.getNom());
			traitrise++;
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("traitrise" + traitrise);
	}
	
	public void faireLeGentil(Humain h, int arg) {
		perdreArgent(arg);
		h.gagnerArgent(arg);
		if (traitrise>(arg/10)) {
			traitrise=traitrise-(arg/10);
		}
	}
}
