package Jeu;

public class Monstre extends AbstractCombattant{

	public Monstre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monstre(String nom, int pointDeVie, int degat) {
		super(nom, pointDeVie, degat);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return "Monstre : "+ nom + ", pointDeVie : " + pointDeVie + ", attaque : " + degat;
	}
	
}
