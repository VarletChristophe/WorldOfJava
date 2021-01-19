package Jeu;

import Interface.IAttaque;
import Interface.ICombattant;

public class BasicAttaque implements IAttaque {

	public int degat;
	
	public BasicAttaque(int degat, double chanceToucher) {
		
	}
	
	@Override
	public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		
		int lanceAtt;
		lanceAtt = (int) Math.random() * 100;
		
		if (lanceAtt < cible.getChanceToucher()) {
			return lanceur.getDegat(); 
		} 
		else {
			System.out.println("Echec de l'attaque de " + lanceur + " sur cible " + cible);
			return 0;
		}
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
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
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDegat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDegat(int degat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChanceToucher(double chanceToucher) {
		// TODO Auto-generated method stub
		
	}

}
