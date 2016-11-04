package Antoine.initiation;

import java.util.Scanner; // package contenant la classe Scanner

public class MonTP1 {

	public static void main(String[] args) {
		// Déclarations des variables
		String msg; // message affiché
		String nom, prenom; // le nom et le prénom saisis au clavier
		
		//saisie du nom et du prénom
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez votre nom :");
		nom = clavier.nextLine();
		System.out.println("Entrez votre prénom :");
		prenom = clavier.nextLine();
		
		//conversions en majuscules et minuscules
		nom = nom.toUpperCase(); // toUpperCase transforme Nom en maj
		prenom = prenom.toLowerCase(); // toLowerCase transforme prenom minus
		
		//Concaténations avec l'opérateur +
		msg = "Bonjour " + prenom + " " + nom + ", et bienvenue sur cette application !";
		
		//affichage du résultat
		System.out.println(msg);
		
		//fermeture du clavier
		clavier.close();

	}

}
