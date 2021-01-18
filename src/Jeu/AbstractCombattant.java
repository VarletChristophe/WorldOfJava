package Jeu;

public abstract class AbstractCombattant {

	public String nom;
	public int pointDeVie;
	public int degat;
	
	/**
	 * Constructeurs 
	 * @param nom
	 * @param pointDeVie
	 * @param degat
	 */

	public AbstractCombattant() {
		super();
	}
	
	public AbstractCombattant(String nom, int pointDeVie, int degat) {
		super();
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.degat = degat;
	}

	/**
	 * Getter et Setter
	 * @return
	 */
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

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

	/**
	 * Méthode toString
	 */
	@Override
	public String toString() {
		return "Combattant [nom : " + nom + ", pdv : " + pointDeVie + ", degats : " + degat + "]";
	}
	
	
}
