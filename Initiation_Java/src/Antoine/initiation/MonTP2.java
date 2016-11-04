package Antoine.initiation;

import javax.swing.JOptionPane; // permet des saisies et affichages graphiques

public class MonTP2 {

	public static void main(String[] args) {
		//Déclarations des variables
		String msg; // message affiché
		String nom, prenom; // le nom et prenom saisie au clavier
		
		//saisie du nom et du prénom
		msg = "Entrez votre nom :";
		nom = JOptionPane.showInputDialog(null, msg, "Saisie", JOptionPane.QUESTION_MESSAGE);
		msg = "Entrez votre prénom :";
		prenom = JOptionPane.showInputDialog(null, msg, "Saisie", JOptionPane.QUESTION_MESSAGE);
		
		//conversions en majuscules et minuscules
		nom = nom.toUpperCase(); // transforme maj
		prenom = prenom.toLowerCase(); // transforme en min
		
		//concaténations avec l'opérateur +
		msg = "Bonjour " + prenom + " " + nom + ", et bvn sur cette app !";
		
		//affichage du résultat 
		JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
	
	}

}
