package Interface;

public interface ICombattant extends IAttaque{
	
	public void attaquer(ICombattant adversaire);
	public void defendre(int degat);
	
	// Getters et Setters
	public String getNom();
	public int getDegat();
	public int getPointDeVie();
	public void setNom(String nom);
	public void setDegat(int degat);
	public void setPointDeVie(int pointDeVie);
	
}
