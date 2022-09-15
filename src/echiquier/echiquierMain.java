package echiquier;

import java.util.Scanner;

public class echiquierMain {

	// n est le numero de la case
	public static void suiteNumerique(int n) {
		int Uo = 2;
		int q = 2;

		double totalParCase = (Uo * (Math.pow(q, (n - 1))));

		System.out.println(totalParCase + " est le nombre de grain de riz présent dans la case numero " + n);
	}

	public static void main(String[] args) {
		System.out.println("Choisir le numero de la case :");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println("Le nombre de grains de riz dans la case est de : ");
		suiteNumerique(n - 1);
	}
}
