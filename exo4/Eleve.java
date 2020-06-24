package exo4;

import java.util.Scanner;

public class Eleve {
	private String firstName, lastName;
	private float maths, physique, francais, anglais, hist_geo, sport;

	public Eleve(String fn, String ln){
		this.firstName = fn;
		this.lastName = ln;
		this.maths = 0;
		this.physique = 0;
		this.francais = 0;
		this.anglais = 0;
		this.hist_geo = 0;
		this.sport = 0;
	}

	public String get_fn() {
		return firstName;
	}

	public String get_ln() {
		return lastName;
	}

	public float get_maths() {
		return maths;
	}

	public float get_physique() {
		return physique;
	}

	public float get_francais() {
		return francais;
	}

	public float get_anglais() {
		return anglais;
	}

	public float get_hist_geo() {
		return hist_geo;
	}

	public float get_sport() {
		return sport;
	}
	
	public float get_average() {
		return ((maths + physique + francais + anglais + hist_geo + sport) / 6 );
	}

	public void set_maths(float i) {
		this.maths = i;
	}

	public void set_physique(float i) {
		this.physique = i;
	}

	public void set_francais(float i) {
		this.francais = i;
	}

	public void set_anglais(float i) {
		this.anglais = i;
	}

	public void set_hist_geo(float i) {
		this.hist_geo = i;
	}

	public void set_sport(float i) {
		this.sport = i;
	}

	public static void qui(Eleve e) {
		Scanner sc = new Scanner(System.in);
		String fn, ln;
		boolean stop = false;

		System.out.println("Bienvenue dans le programme de notation des éleves.");
		while (stop == false) {
			System.out.println("Entrez le prénom d'un éleve pour acceder à ses notes.");
			fn = sc.nextLine();
			System.out.println("Entrez maintenant son nom de famille.");
			ln = sc.nextLine();
			if(fn.equals(e.get_fn()) && ln.equals(e.get_ln())) {
				stop = true;
						notation(e);
			}
			else {
				System.out.println("Cet éleve n'existe pas.");
			}
		}
	}

	public static void notation(Eleve e) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		int input;

		System.out.println("Bienvenue dans le dossier de l'éleve : "+e.get_fn()+' '+e.get_ln()+'.');
		while (stop == false) {
			System.out.println("Pour afficher ses notes tapez 1, pour modifier ses notes, tapez 2, et pour quitter, tapez 3");
			input = sc.nextInt();
			if (input == 1)
				notes_disp(e);
			else if (input == 2)
				notes_change(e);
			else if (input == 3)
				stop = true;
		}
	}
	
	public static void notes_disp(Eleve e) {
		System.out.println("Voici les notes de "+e.get_fn()+' '+e.get_ln()+" :");
		System.out.println("Maths : "+e.get_maths());
		System.out.println("Physique : "+e.get_physique());
		System.out.println("Francais : "+e.get_francais());
		System.out.println("Anglais : "+e.get_anglais());
		System.out.println("Histoire-géographie : "+e.get_hist_geo());
		System.out.println("Sport : "+e.get_sport());
		System.out.println("Moyenne : "+e.get_average());
	}
	
	public static void notes_change(Eleve e) {
		String input1;
		float input2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecrivez le nom de la matiere que vous souhaitez modifier");
		input1 = sc.nextLine();
		System.out.println("Ecrivez la nouvelle valeur de la matiere "+input1);
		input2 = sc.nextFloat();
		if(input1.equals("Maths"))
			e.set_maths(input2);
		else if(input1.equals("Physique"))
			e.set_physique(input2);
		else if(input1.equals("Francais"))
			e.set_francais(input2);
		else if(input1.equals("Anglais"))
			e.set_anglais(input2);
		else if(input1.equals("Histoire-geo"))
			e.set_hist_geo(input2);
		else if(input1.equals("Sport"))
			e.set_sport(input2);
	}
}
