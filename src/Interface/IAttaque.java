package Interface;

public interface IAttaque {

	public int LancerAttaque(ICombattant lanceur, ICombattant cible);
	
	// Getters et Setters
	public String getNom();
	public String getDescription();
	public double getChanceToucher();
	public int getDegat();
	public void setNom(String nom);
	public void setDescription(String description);
	public void setChanceToucher(double chanceToucher);
	public void setDegat(int degat);
	
}
