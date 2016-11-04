// TP Java
// Classe offrant différents services courants sous forme de méthodes à portée classe
// Auteur : JM CARTRON
// Dernière mise à jour : 10/9/2013

package Antoine.Initiation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DecimalFormat; 
import javax.swing.JOptionPane;

public class Outils {

	// --------------------------------------------------------------------------------------------------------------------------
	// --------------------------------------outils de saisie et d'affichage-----------------------------------------------------
	// --------------------------------------------------------------------------------------------------------------------------

	/**
	 * affiche une boite de dialogue pour saisir une donnée
	 * @param msg   : le message indiquant ce qu'il faut saisir
	 * @param titre : le titre de la boite de dialogue
	 * @return      : la chaine saisie (type String)
	 */
	public static String Saisir(String msg, String titre) {
		return JOptionPane.showInputDialog(null, msg, titre, JOptionPane.QUESTION_MESSAGE);
	}
	
	/**
	 * affiche une boite de dialogue pour saisir une donnée (avec un titre par défaut : "Saisie")
	 * @param msg   : le message indiquant ce qu'il faut saisir
	 * @return      : la chaine saisie (type String)
	 */
	public static String Saisir(String msg) {
		return JOptionPane.showInputDialog(null, msg, "Saisie", JOptionPane.QUESTION_MESSAGE);
	}
	
	/**
	 * affiche un message dans une boite de dialogue
	 * @param msg   : le message à afficher
	 * @param titre : le titre de la boite de dialogue
	 */
	public static void Afficher(String msg, String titre) {
		JOptionPane.showMessageDialog(null, msg, titre, JOptionPane.INFORMATION_MESSAGE);
	}	
	
	/**
	 * affiche un message dans une boite de dialogue (avec un titre par défaut : "Message")
	 * @param msg   : le message à afficher
	 */
	public static void Afficher(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	// --------------------------------------------------------------------------------------------------------------------------
	// --------------------------------------outils concernant le traitement des nombres-----------------------------------------
	// --------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * teste si une chaine est bien numérique
	 * @param laChaine : la chaine à tester
	 * @return         : booléen - true si la chaine représente un nombre correct
	 *                             false dans les autres cas
	 */
	public static boolean isNumeric (String laChaine) {
		if (laChaine == null) return false;
		try {
			laChaine = laChaine.replace(",", ".");
			@SuppressWarnings("unused")
			double Nombre = Double.parseDouble(laChaine);
			// new java.math.BigDecimal(laChaine);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * convertit un nombre en chaine formatée
	 * @param unNombre : le nombre à formater
	 * @param unFormat : le format de conversion (exemples : "00", "0.00", "###,###,##0.00", ...)
	 * @return
	 */
	public static String FormaterNombre(double unNombre, String unFormat) {
	    DecimalFormat df = new DecimalFormat(unFormat);	
		return df.format(unNombre);
	}	
	
	
	// --------------------------------------------------------------------------------------------------------------------------
	// --------------------------------------outils concernant le traitement des dates-------------------------------------------
	// --------------------------------------------------------------------------------------------------------------------------	

	/**
	 * teste si une chaine est bien une date
	 * @param laChaine : la chaine à tester
	 * @return         : booléen - true si la chaine représente une date correcte
	 *                             false dans les autres cas
	 */
	public static boolean isDate (String laChaine) throws ParseException {
		if (laChaine == null) return false;
		try {
			@SuppressWarnings("unused")
			Date uneDate;
			uneDate = Outils.ConvertirEnDate(laChaine);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}  
	
	/**
	 * convertit une chaine date en un objet Date
	 * @param uneChaineDate   : la chaine à convertir
	 * @return                : l'objet Date obtenu par la conversion de la chaine
	 * @throws ParseException
	 */
	public static Date ConvertirEnDate(String uneChaineDate) throws ParseException {
		SimpleDateFormat leFormat = new SimpleDateFormat("dd/MM/yyyy");
		return leFormat.parse(uneChaineDate);
	}

	/**
	 * convertit une date en une chaine formatée
	 * @param uneDate : la date à formater
	 * @return        : la chaine formatée
	 */
	public static String FormaterDate(Date uneDate) {
		SimpleDateFormat leFormat = new SimpleDateFormat("dd/MM/yyyy");
		return leFormat.format(uneDate);
	}

	/**
	 * convertit une date en une chaine formatée comprenant également l'heure
	 * @param uneDate : la date et l'heure à formater
	 * @return        : la chaine formatée
	 */
	public static String FormaterDateHeure(Date uneDate) {
		SimpleDateFormat leFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return leFormat.format(uneDate);
	}
	
	/**
	 * fournit le jour de la semaine à partir d'une date
	 * @param uneDate : la date étudiée
	 * @return        : le jour de la semaine (exemples : "dimanche", "lundi", ...)
	 */
	public static String JourDeLaSemaine(Date uneDate)	{
		SimpleDateFormat leFormat = new SimpleDateFormat("EEEE");	// "EEEE" : jour de la semaine
		return leFormat.format(uneDate);
	}
	
	/**
	 * fournit l'année à partir d'une date
	 * @param uneDate : la date étudiée
	 * @return        : l'année sur 4 chiffres
	 */
	public static int Annee(Date uneDate) {
		SimpleDateFormat leFormat = new SimpleDateFormat("yyyy");	// "yyyy" : année sur 4 chiffres
		return Integer.parseInt(leFormat.format(uneDate));
	}
	
	/**
	 * fournit une date en ajoutant des jours à une autre date
	 * @param uneDate   : la date de départ
	 * @param nbDeJours : le nombre de jours à ajouter (ce nombre peut être négatif)
	 * @return          : la nouvelle date obtenue
	 */
	public static Date AjouterDesJours(Date uneDate, int nbDeJours) {
		Calendar calendrier = Calendar.getInstance();
		calendrier.setTime(uneDate);
		calendrier.add(Calendar.DATE, nbDeJours);
		return calendrier.getTime();
	}
	
	/**
	 * La fonction DateUS convertit une date française (j/m/a) au format US (a-m-j)
	 * par exemple, le paramètre '16/05/2007' donnera '2007-05-16'
	 * @param laDate : la date à transformer
	 * @return       : la date transformée
	 */
	public static String DateUS (String laDate)
	{	String[] tableau = laDate.split ("/");		// on extrait les segments de la chaine laDate séparés par des "/"
		String J = tableau[0];
		String M = tableau[1];
		String A = tableau[2];
		return (A + "-" + M + "-" + J);				// on les reconcatène dans un ordre différent
	}

	/**
	 * La fonction DateFR convertit une date US (a-m-j) au format Français (j/m/a)
	 * par exemple, le paramètre '2007-05-16' donnera '16/05/2007'
	 * @param laDate : la date à transformer
	 * @return       : la date transformée
	 */
	public static String DateFR (String laDate)
	{	String[] tableau = laDate.split ("-");		// on extrait les segments de la chaine laDate séparés par des "-"
		String A = tableau[0];
		String M = tableau[1];
		String J = tableau[2];
		return (J + "/" + M + "/" + A);				// on les reconcatène dans un ordre différent
	}

	
	// --------------------------------------------------------------------------------------------------------------------------
	// --------------------------------------outils concernant le traitement des chaines ----------------------------------------
	// --------------------------------------------------------------------------------------------------------------------------	

	/**
	 * complète la chaine fournie par des espaces jusqu'à la longueur désirée
	 * @param laChaine : la chaine à compléter
	 * @param longueur : la longueur à obtenir
	 * @return         : la chaine complétée
	 */
	public static String CompleterChaine(String laChaine, int longueur) {
		while ( laChaine.length() < longueur ) {
			laChaine = laChaine + " ";
		}
		return laChaine;
	}
	
	/**
	 * complète la chaine fournie par un caractère choisi jusqu'à la longueur désirée
	 * @param laChaine    : la chaine à compléter
	 * @param longueur    : la longueur à obtenir
	 * @param leCaractere : le caractère utilisé pour compléter la chaine
	 * @return            : la chaine complétée
	 */
	public static String CompleterChaine(String laChaine, int longueur, char leCaractere) {
		while ( laChaine.length() < longueur ) {
			laChaine = laChaine + leCaractere;
		}
		return laChaine;
	}	
	
	
	
}
