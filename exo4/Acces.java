package exo4;

import java.util.Scanner;

public class Acces {
	final static String good_user = "prof", good_pwd = "prof";
	
	static void run(Eleve e) {
		Scanner sc = new Scanner(System.in);
		String user, pwd;
		
		System.out.println("Bonjour, bienvenue dans le programme de notation des éleves, veuillez entrer votre nom d'utilisateur.");
		user = sc.nextLine();
		System.out.println("Veuillez entrer votre mot de passe.");
		pwd = sc.nextLine();
		if (user.equals(good_user) && pwd.equals(good_pwd))
			Eleve.qui(e);
		else {
			System.out.println("Vous n'êtes pas autorisé a noter les éleves.\nRetour au départ.");
		}
	}
}
