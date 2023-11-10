package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String n, int a, String b) {
		this.nom=n;
		this.argent=a;
		this.boisson=b;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String t) {
		System.out.println("(" + this.nom + ") - " + t);		
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " +this.nom + " et j'aime boire du " + this.boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int a) {
		this.argent=this.argent+a;
	}
	
	public void perdreArgent(int a) {
		this.argent=this.argent-a;
	}
}

