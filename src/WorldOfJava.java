import java.util.Scanner;
import Jeu.Personnage;

public class WorldOfJava {
	public static void main(String[] args) {
		personnageFactory();
	}
	
	/**
	 * Méthode qui 
	 * 		- Demande la saisie d'un nom de personnage à la console
	 * 		- crée une instance de Personnage avec 
	 * 			- Le nom saisi
	 * 			- Le nombre de point de vie à 100
	 * 			- Le nombre de dégat à 0
	 */
	public static void personnageFactory () {
		
		Scanner nomPersonnage = new Scanner(System.in);

		System.out.println("Veuillez un nom de personnage :");
		String str = nomPersonnage.next();
		
		Personnage p1 = new Personnage (100, 0, str);
		System.out.println(p1);
	}
}
