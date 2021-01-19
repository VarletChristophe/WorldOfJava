package Jeu;

import Interface.IAttaque;
import Interface.ICombattant;

public class Monstre extends AbstractCombattant implements IAttaque{

	public Monstre() {
		super();
		// TODO Auto-generated constructor stub
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
