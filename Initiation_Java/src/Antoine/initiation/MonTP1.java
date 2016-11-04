package Antoine.initiation;

import java.util.Scanner; // package contenant la classe Scanner

public class MonTP1 {

	public static void main(String[] args) {
		// D�clarations des variables
		String msg; // message affich�
		String nom, prenom; // le nom et le pr�nom saisis au clavier
		
		//saisie du nom et du pr�nom
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez votre nom :");
		nom = clavier.nextLine();
		System.out.println("Entrez votre pr�nom :");
		prenom = clavier.nextLine();
		
		//conversions en majuscules et minuscules
		nom = nom.toUpperCase(); // toUpperCase transforme Nom en maj
		prenom = prenom.toLowerCase(); // toLowerCase transforme prenom minus
		
		//Concat�nations avec l'op�rateur +
		msg = "Bonjour " + prenom + " " + nom + ", et bienvenue sur cette application !";
		
		//affichage du r�sultat
		System.out.println(msg);
		
		//fermeture du clavier
		clavier.close();

	}

}
