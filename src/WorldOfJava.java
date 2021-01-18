
import Jeu.Personnage;
import java.util.Scanner;

public class WorldOfJava {
	
	
	public static void main(String[] args) {
		
		Personnage p1 = new Personnage();
		p1.setNom(Monde.personnageFactory());
		p1.setPointDeVie(100);
		p1.setDegat(0);
		
		Monde.afficherInformations(p1);
		
	}
	
	/**
	 * Classe statique MONDE qui permet de demander le nom d'un Personnage et afficher les informations de celui-ci
	 * @author varle
	 *
	 */
	static class Monde {

		public static String personnageFactory() {
			
			@SuppressWarnings("resource")
			Scanner nomPersonnage = new Scanner(System.in);

			System.out.println("Veuillez un nom de personnage :");
			String str = nomPersonnage.next();
			
			return str;
			
		}
		
		public static void afficherInformations (Personnage personnage) {
			System.out.println(personnage);
		}
		
		
	}
	/**
	 * Méthode qui 
	 * 		- Demande la saisie d'un nom de personnage à la console
	 * 		- crée une instance de Personnage avec 
	 * 			- Le nom saisi
	 * 			- Le nombre de point de vie à 100
	 * 			- Le nombre de dégat à 0

	public static void personnageFactory () {
		
		Scanner nomPersonnage = new Scanner(System.in);
	
		System.out.println("Veuillez un nom de personnage :");
		String str = nomPersonnage.next();
		
		Personnage p1 = new Personnage (100, 0, str);
		System.out.println(p1);
	}
	*/
}
