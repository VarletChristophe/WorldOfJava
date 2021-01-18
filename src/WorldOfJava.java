
import Jeu.AbstractCombattant;
import Jeu.Monstre;
import Jeu.Personnage;

import java.util.Random;
import java.util.Scanner;

import Interface.ICombattant;

public class WorldOfJava {
	
	
	public static void main(String[] args) {
		
		// 										VERSION 1
		//Personnage p1 = new Personnage();
		//p1 = Monde.personnageFactory();
		//Monde.afficherInformations(p1);
		//Monstre m1 = new Monstre();
		//m1 = Monde.monstreFactory();
		//Monde.afficherInformations(m1);
		//Monde.combat(p1,m1);
		
		// 										VERSION 2
		Monde.combat(Monde.personnageFactory(), Monde.monstreFactory());
		
	}
	
	/**
	 * Classe statique MONDE qui permet de demander le nom d'un Personnage et afficher les informations de celui-ci
	 * @author varle
	 *
	 */
	static class Monde {
		
		/**
		 * 
		 *                               VERSION 1 (Exercice 4)
		 *                               
		 * Classe permettant de cr�er un personnage en demandant la saisie du nom du personnage � la console.
		 * Nombre de point de vie = 100
		 * Nombre de d�gats inflig�s lors du combat = 4
		 * @return
		 */
		//public static Personnage personnageFactory() {
		//	
		//	@SuppressWarnings("resource")
		//	Scanner nomPersonnage = new Scanner(System.in);
		//
		//	System.out.println("Veuillez entrer un nom de personnage :");
		//	String str = nomPersonnage.nextLine();
		//	
		//	Personnage personnage1 = new Personnage(str, 100, 4);
		//	return personnage1;
		//	//return str;
		//	
		//}
		
		/**
		 * 
		 *                               VERSION 2 (Exercice 5)
		 *                               
		 * Classe permettant de cr�er un personnage en demandant la saisie du nom du personnage � la console.
		 * Nombre de point de vie = 100
		 * Nombre de d�gats inflig�s lors du combat = 4
		 * @return
		 */
		public static ICombattant personnageFactory() {
			
			@SuppressWarnings("resource")
			Scanner nomPersonnage = new Scanner(System.in);

			System.out.println("Veuillez entrer un nom de personnage :");
			String str = nomPersonnage.nextLine();
			
			Personnage personnage1 = new Personnage(str, 100, 4);
			return personnage1;
			//return str;
			
		}
		
		/**
		 * Param�tres debutNom et finNom pour donner un nom al�atoire au montre avec la m�thode Random
		 *
		 */
		public static String[] debutNom = new String [] {
				"Chat", "Chien", "Chaton", "Loup", "Ours"
		};
			
		public static String[] finNom = new String [] {
				"hurlant", "de feu", "mignon", "gentil", "tr�s con"
		};
	
		/**
		 * 
		 *                               VERSION 1 (Exercice 4)
		 *  
		 * Classe permettant de cr�er un monstre en cr�ant son nom de mani�re al�atoire (random) � partir des param�tres debutNom et finNom.
		 * Nombre de point de vie = 200
		 * Nombre de d�gats inflig�s lors du combat = 3
		 * @return
		 */
		//public static Monstre monstreFactory() {
		//	
		//	String str = debutNom[new Random().nextInt(debutNom.length)] + " " + finNom[new Random().nextInt(finNom.length)];
		//	
		//	Monstre monstre1 = new Monstre(str, 200, 3);
		//	return monstre1;
		//	
		//}
		
		/**
		 * 
		 *                               VERSION 2 (Exercice 5)
		 *  
		 * Classe permettant de cr�er un monstre en cr�ant son nom de mani�re al�atoire (random) � partir des param�tres debutNom et finNom.
		 * Nombre de point de vie = 200
		 * Nombre de d�gats inflig�s lors du combat = 3
		 * @return
		 */
		public static ICombattant monstreFactory() {
			
			String str = debutNom[new Random().nextInt(debutNom.length)] + " " + finNom[new Random().nextInt(finNom.length)];
			
			ICombattant monstre1 = new Monstre(str, 200, 3);
			return monstre1;
			
		}


		/**
		 * 
		 *                               VERSION 1 (Exercice 4)
		 *                               
		 * Methode permettant de faire un combat entre un Personnage et un Monstre
		 * Le combat s'arr�te d�s que l'un des combattants n'a plus de Point de Vie.
		 * @param personnage
		 * @param monstre
		 */
		//public static void combat(Personnage personnage, Monstre monstre) {
		//	Boolean turn = true;
		//
		//	while (personnage.pointDeVie>0 && monstre.pointDeVie>0) {
		//		if (turn) {
		//			personnage.pointDeVie -= monstre.degat;
		//			System.out.println("1");
		//			Monde.afficherInformations(personnage);
		//			Monde.afficherInformations(monstre);
		//			turn = false;
		//		}
		//		else {
		//			monstre.pointDeVie -= personnage.degat;
		//			System.out.println("2");
		//			Monde.afficherInformations(personnage);
		//			Monde.afficherInformations(monstre);
		//			turn = true;
		//		}
		//	}
		//	
		//}
		
		
		
		/**
		 * 		 
		 *                               VERSION 2 (Exercice 5)
		 *                               
		 * Methode permettant de faire un combat entre un Personnage et un Monstre
		 * Le combat s'arr�te d�s que l'un des combattants n'a plus de Point de Vie.
		 * @param personnage
		 * @param monstre
		 */
		public static void combat(ICombattant combattant1, ICombattant combattant2) {
			Boolean turn = true;

			while (combattant1.getPointDeVie()>0 && combattant2.getPointDeVie()>0) {
				if (turn) {
					combattant1.setPointDeVie(combattant1.getPointDeVie()- combattant2.getDegat());
					turn = false;
				}
				else {
					combattant2.setPointDeVie(combattant2.getPointDeVie()- combattant1.getDegat());
					turn = true;
				}
				Monde.afficherInformations(combattant1);
				Monde.afficherInformations(combattant2);
			}
			
		}
		

		/**
		 * 
		 *                               VERSION 1 (Exercice 4)
		 * 		       
		 * Affichage des informations pour le Personnage ou le Monstre 
		 * (en utilisant la classe abstraite AbstractCombattant qui vient en h�ritage dans les classes Personnage et Monstre.
		 * @param absComb
		 */
		//public static void afficherInformations (AbstractCombattant absComb) {
		//	System.out.println(absComb);
		//}
		
		/**
		 * 
		 *                               VERSION 2 (Exercice 5)
		 * 		       
		 * Affichage des informations pour le Personnage ou le Monstre 
		 * (en utilisant la classe abstraite AbstractCombattant qui vient en h�ritage dans les classes Personnage et Monstre.
		 * @param absComb
		 */
		public static void afficherInformations (ICombattant absComb) {
			System.out.println(absComb);
		}
	}
	/**
	 * M�thode qui 
	 * 		- Demande la saisie d'un nom de personnage � la console
	 * 		- cr�e une instance de Personnage avec 
	 * 			- Le nom saisi
	 * 			- Le nombre de point de vie � 100
	 * 			- Le nombre de d�gat � 0

	public static void personnageFactory () {
		
		Scanner nomPersonnage = new Scanner(System.in);
	
		System.out.println("Veuillez un nom de personnage :");
		String str = nomPersonnage.next();
		
		Personnage p1 = new Personnage (100, 0, str);
		System.out.println(p1);
	}
	*/
}
