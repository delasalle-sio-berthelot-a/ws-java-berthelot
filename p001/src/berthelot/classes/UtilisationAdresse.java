package berthelot.classes;

import jim.classes.Adresse;
import jim.classes.Outils;

public class UtilisationAdresse {

	public static void main(String[] args) {
		String titre = "Test de la classe Adresse";
		String msg;
		
		Adresse uneAdresse;			//déclaration d'un objet de la classe Adresse
		uneAdresse = new Adresse(); //création (ou instanciation) de l'objet
		
		//écriture des membres de l'objet
		uneAdresse.rue = "55, rue du Faubourg Saint-Honoré";
		uneAdresse.cp = "7500";
		uneAdresse.ville = "paris";
		uneAdresse.numTel = "014292";
		
		//lecture des membres
		msg = "Rue :" + "\t\t" + uneAdresse.rue + "\r\n";
		msg += "Code postal : " + "\t" + uneAdresse.cp +"\r\n";
		msg += "Ville : " + "\t\t" +uneAdresse.ville + "\r\n";
		msg += "N° téléphone : " + "\t" + uneAdresse.numTel;
		
		Outils.Afficher(msg, titre);
		}

}
