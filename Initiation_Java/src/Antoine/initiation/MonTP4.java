package Antoine.initiation;

public class MonTP4 {

	public static String TansformeEnPrenom(String laChaine) {
		String partie1; // première maj
		String partie2; // min et tiret
		String partie3; // Deuxième maj
		String partie4; // min
		int longueur;
		int positionTiret;
		
		laChaine = laChaine.trim(); //supprime espaces inutiles
		longueur = laChaine.length();
		if (longueur < 2) return laChaine.toUpperCase();
		positionTiret = laChaine.indexOf("-");
		if (positionTiret == -1)
		{ 
			partie1 = laChaine.substring(0,1);
			partie2 = laChaine.substring(1, longueur - 1);
			return partie1.toUpperCase() + partie2.toLowerCase();
		}
		else
		{
			partie1 = laChaine.substring(0,1);
			partie2 = laChaine.substring(1,positionTiret);
			partie3 = laChaine.substring(positionTiret +1,1);
			partie4 = laChaine.substring(positionTiret +2, longueur - positionTiret -2);
			return partie1.toUpperCase() + partie2.toLowerCase() + partie3.toUpperCase() + partie4.toLowerCase();
		}
	}

}
