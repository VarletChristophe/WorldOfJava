package Jeu;

public class Personnage extends AbstractCombattant{
	
	/**
	 * Attributs
	 */
	// En commentaire car les attributs sont déclarés dans la classe abstraite AbstractCombattant
	//private int pointDeVie;
	//private int degat;
	//private String nom;
	
	/**
	 * Constructeurs
	 */
	public Personnage() {
		super();
	}
	
	public Personnage(String nom, int pointDeVie, int degat) {
		super();
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.degat = degat;
	}

	/**
	 * Getter et Setter
	 * @return
	 */
	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return "Nom : "+ nom + ", pointDeVie : " + pointDeVie + ", attaque : " + degat;
	}

	
	
}
