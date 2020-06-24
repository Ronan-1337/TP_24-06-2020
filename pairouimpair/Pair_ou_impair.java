package pairouimpair;

import java.util.Scanner;

public class Pair_ou_impair {

	public static void run(int i){
		int reste;
		
		reste = i % 2;
		if(reste == 0)
			System.out.println("le nombre "+i+" est pair.");
		else if(reste == 1)
			System.out.println("le nombre "+i+" est impair.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("Bienvenue dans le programme pair ou impair, entrez un nombre entier s'il vous plaît.");
		input = sc.nextInt();
		run(input);
	}

}
