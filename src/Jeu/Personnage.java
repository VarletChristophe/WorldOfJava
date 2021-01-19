package Jeu;

import Interface.IAttaque;
import Interface.ICombattant;

public class Personnage extends AbstractCombattant implements IAttaque{
	
	/**
	 * Attributs
	 */
	// En commentaire car les attributs sont déclarés dans la classe abstraite AbstractCombattant
	//private int pointDeVie;
	//private int degat;
	//private String nom;
	Classe classe;
	
	/**
	 * Constructeurs
	 */
	public Personnage() {
		super();
	}
	
	public Personnage(String nom, int pointDeVie, int degat, Classe classe) {
		super();
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.degat = degat;
		this.classe = classe;
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
		return "Nom : "+ nom + ", pointDeVie : " + pointDeVie + ", attaque : " + degat + ", classe : " + classe;
	}

	@Override
	public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getChanceToucher() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChanceToucher(double chanceToucher) {
		// TODO Auto-generated method stub
		
	}

	
	
}
