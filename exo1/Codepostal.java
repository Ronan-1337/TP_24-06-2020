package exo1;

import java.util.Scanner;

public class Codepostal {
	static void run(){
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.println("Bonjour, bienvenue dans le programme de contôle des codes postaux.\nSaisissez un code postal s'il vous plait.");
		input = sc.nextLine();
		if ((input.length() == 5) & input.matches("^[0-9]{5}$"))
			System.out.println(input+" est un code postal valide.");
		else
			System.out.println(input+" n'est pas un code postal valide.");
	}
}
