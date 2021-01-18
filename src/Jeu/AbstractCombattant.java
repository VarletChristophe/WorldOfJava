package Jeu;

import Interface.ICombattant;

public abstract class AbstractCombattant implements ICombattant {



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
	 * M�thode toString
	 */
	@Override
	public String toString() {
		return "Combattant [nom : " + nom + ", pdv : " + pointDeVie + ", degats : " + degat + "]";
	}
	
	/**
	 * M�thode r�cup�r�e de l'interface ICombattant pour attaquer ou d�fendre
	 * Attaquer : Les points de vie de l'adversaire sont diminu�s des degats de l'attaquant
	 * Defendre : Les points de vie de l'attaquant sont diminu�s des degats de l'adversaire ... pass�s en param�tre)
	 */
	@Override
	public void attaquer(ICombattant adversaire) {
		adversaire.setPointDeVie(adversaire.getPointDeVie() - this.degat);
	}

	@Override
	public void defendre(int degat) {
		this.setPointDeVie(this.getPointDeVie() - degat);
	}
}
