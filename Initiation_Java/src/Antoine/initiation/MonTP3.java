package Antoine.initiation;

public class MonTP3 {

	public static void main(String[] args) {
		String msg;
		String nom, prenom;
		
		nom = Outils.Saisir("Entrez votre nom :");
		prenom = Outils.Saisir("Entrez votre pr�nom ;");
		
		//conversions en majuscules et minuscules
		nom = nom.toUpperCase();
		prenom = prenom.toLowerCase();
		
		//concat�nation avec l'op�rateur +
		msg = "Bonjour " + prenom + " " + nom + " bvn sur l'app";
		
		//affichage du res
		Outils.Afficher(msg);

	}

}
