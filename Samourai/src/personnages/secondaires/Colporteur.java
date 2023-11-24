package personnages.secondaires;
import personnages.principaux.*;

public class Colporteur extends Commercant {

	public Colporteur(String n, int a) {
		super(n, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int seFaireExtorquer() {
		int b = getArgent();
		b=b/2;
		perdreArgent(b);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return b;
	}
	
	
	

}
