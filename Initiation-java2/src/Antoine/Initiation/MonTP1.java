package Antoine.Initiation;

public class MonTP1 {

	public static void main(String[] args) {
		String expression = "^.@.+\\$";// expression régulière donnant le format d'une adresse mail
		
		String adresseSaisie;
		int position; // position du @ (ou -1 si le caract @ est absent)
		String gauche, droite, msg;
		int longueur;
		
		adresseSaisie = Outils.Saisir("Entrez une adresse de messagerie : ");
		
		if (adresseSaisie.matches(expression)==false)
		{ msg = "L'adresse " + adresseSaisie + "est incorrecte !!!!!!!!";
		Outils.Afficher(msg);
		}
		
		else
		{
			position = adresseSaisie.indexOf("@");
			longueur = adresseSaisie.length();
			gauche = adresseSaisie.substring(0, position +1);
			droite = adresseSaisie.substring(position, longueur -1);
			
			msg = "Vous avez entré l'adresse de messagerie suivante : \n";
			msg = msg + "\t" + adresseSaisie + "\n\n";
			msg = msg + "Votre identifiant est : " + gauche + "\n\n";
			msg = msg + "Votre serveur de messagerie est : " + droite + "\n";
			Outils.Afficher(msg);
		}

	}

}
