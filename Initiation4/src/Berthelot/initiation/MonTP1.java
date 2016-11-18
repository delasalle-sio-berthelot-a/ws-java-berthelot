package Berthelot.initiation;

import java.util.Date;

import java.text.ParseException;

public class MonTP1 {

	public static void main (String[] args) throws ParseException{
	
		String Msg;
		Date DateHeureEte, DateHeureHiver;

		DateHeureEte = DateDebutHeureEte(2016);
		Msg	="Heure d'été 2016 : " + Outils.FormaterDate(DateHeureEte);
		Outils.Afficher(Msg, "Changement d'heure");		
		

		DateHeureHiver = DateDebutHeureHiver(2016);
		Msg	="Heure d'hiver 2016 : " + Outils.FormaterDate(DateHeureHiver) + "  ";
		Outils.Afficher(Msg, "Changement d'heure");		
	
	changementsHeure();
	}


	private static Date DateDebutHeureEte(Integer Annee)throws ParseException {
		String ChaineDateChangement;
		Date DateChangement;
		ChaineDateChangement ="31/03/" + Annee;
		DateChangement = Outils.ConvertirEnDate(ChaineDateChangement);
		
		while ( ! Outils.JourDeLaSemaine(DateChangement).equals("dimanche") ) {
			DateChangement = Outils.AjouterDesJours(DateChangement, -1);
		}
		return DateChangement;
	}

	private static Date DateDebutHeureHiver(Integer Annee)throws ParseException {
		String ChaineDateChangement;
		Date DateChangement;
		ChaineDateChangement ="31/10/" + Annee;
		DateChangement = Outils.ConvertirEnDate(ChaineDateChangement);
		
		while ( ! Outils.JourDeLaSemaine(DateChangement).equals("dimanche") ) {
			DateChangement = Outils.AjouterDesJours(DateChangement, -1);
		}
		return DateChangement;
	}

	
	public static void changementsHeure() throws ParseException

	{

	String msg;

	int annee, anneeDebut;

	Date dateHeureEte, dateHeureHiver;

	anneeDebut = Outils.Annee(new Date());



	msg = "Année" + "\t" + "Heure d'été" + "\t" + "Heure d'hiver" +"\r" + "\r";

	for (annee = anneeDebut; annee <= anneeDebut + 9; annee++)

	{

	dateHeureEte = DateDebutHeureEte(annee);

	dateHeureHiver = DateDebutHeureHiver(annee);

	msg = msg + Outils.FormaterNombre(annee,"0000") + "\t" + Outils.FormaterDate(dateHeureEte)

	+ "\t" + Outils.FormaterDate(dateHeureHiver) + "\r";

	}

	System.out.println(msg);

	}

}
