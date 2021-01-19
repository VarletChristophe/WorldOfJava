package Jeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interface.IAttaque;
import Interface.ICombattant;

public class Classe implements IAttaque {

	/**
	 * Attributs
	 */
	public String nomClasse;
	public List<IAttaque> attaque = new ArrayList<IAttaque>();
	
	/**
	 * Constructeurs
	 */
	public Classe() {
		super();
	}
	
	

	public Classe(String nom, List<IAttaque> attaque) {
		super();
		this.nomClasse = nom;
		this.attaque = attaque;
	}
	
	public IAttaque getAttaque(List<IAttaque> attaque) {
		IAttaque attChoisie = null;
		Random rand = new Random();
		int randomIndex = rand.nextInt(attaque.size());
		attChoisie = attaque.get(randomIndex);
		return attChoisie;
	}

	// Getter et Setter
	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	@Override
	public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		// TODO Auto-generated method stub
		return 0;
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
	public int getDegat() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void setDegat(int degat) {
		// TODO Auto-generated method stub
		
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
	public void setChanceToucher(double chanceToucher) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "Classe [nomClasse=" + nomClasse + ", attaque=" + attaque + "]";
	}

	
}
