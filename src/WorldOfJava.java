
import Jeu.AbstractCombattant;
import Jeu.Monstre;
import Jeu.Personnage;

import java.util.Random;
import java.util.Scanner;

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
		 * Classe permettant de créer un personnage en demandant la saisie du nom du personnage à la console.
		 * Nombre de point de vie = 100
		 * Nombre de dégats infligés lors du combat = 4
		 * @return
		 */
		public static Personnage personnageFactory() {
			
			@SuppressWarnings("resource")
			Scanner nomPersonnage = new Scanner(System.in);

			System.out.println("Veuillez entrer un nom de personnage :");
			String str = nomPersonnage.nextLine();
			
			Personnage personnage1 = new Personnage(str, 100, 4);
			return personnage1;
			//return str;
			
		}
		
		/**
		 * Paramètres debutNom et finNom pour donner un nom aléatoire au montre avec la méthode Random
		 *
		 */
		public static String[] debutNom = new String [] {
				"Chat", "Chien", "Chaton", "Loup", "Ours"
		};
			
		public static String[] finNom = new String [] {
				"hurlant", "de feu", "mignon", "gentil", "très con"
		};
	
		/**
		 * Classe permettant de créer un monstre en créant son nom de manière aléatoire (random) à partir des paramètres debutNom et finNom.
		 * Nombre de point de vie = 200
		 * Nombre de dégats infligés lors du combat = 3
		 * @return
		 */
		public static Monstre monstreFactory() {
			
			String str = debutNom[new Random().nextInt(debutNom.length)] + " " + finNom[new Random().nextInt(finNom.length)];
			
			Monstre monstre1 = new Monstre(str, 200, 3);
			return monstre1;
			
		}
		
		/**
		 * Methode permettant de faire un combat entre un Personnage et un Monstre
		 * Le combat s'arrête dés que l'un des combattants n'a plus de Point de Vie.
		 * @param personnage
		 * @param monstre
		 */
		public static void combat(Personnage personnage, Monstre monstre) {
			Boolean turn = true;

			while (personnage.pointDeVie>0 && monstre.pointDeVie>0) {
				if (turn) {
					personnage.pointDeVie -= monstre.degat;
					System.out.println("1");
					Monde.afficherInformations(personnage);
					Monde.afficherInformations(monstre);
					turn = false;
				}
				else {
					monstre.pointDeVie -= personnage.degat;
					System.out.println("2");
					Monde.afficherInformations(personnage);
					Monde.afficherInformations(monstre);
					turn = true;
				}
			}
			
		}
		
		/**
		 * Affichage des informations pour le Personnage ou le Monstre 
		 * (en utilisant la classe abstraite AbstractCombattant qui vient en héritage dans les classes Personnage et Monstre.
		 * @param absComb
		 */
		public static void afficherInformations (AbstractCombattant absComb) {
			System.out.println(absComb);
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
