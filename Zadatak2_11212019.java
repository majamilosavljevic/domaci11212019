package domaci_11212019;

import java.util.Scanner;

public class Zadatak2_11212019 {

	public static void arrayDivisibleByK(int[] array, int k) {
		String result = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				result += array[i] + " ";
			}
		}
		if (result == "") {
			System.out.println("Nijedan element niza nije deljiv sa 5");
		} else {
			System.out.println("Elementi niza deljivi sa " + k + ": ");
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od N elemenata niza, kao i neki broj K za deljivost.
		 * Napisati metodu koja ispisuje elemente niza deljive brojem K.
		 */

		Scanner scan = new Scanner(System.in);
		int n = 0;
		while (n <= 1) {
			System.out.println("Unesite duzinu niza (min 2): ");
			n = scan.nextInt();
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza: ");
			array[i] = scan.nextInt();
		} 
		int k = 0;
		while (k <= 0) {
			System.out.println("Unesite ceo broj veci od 0 da proverite deljivost elemenata niza istim:");
			k = scan.nextInt();
		}
		arrayDivisibleByK(array, k);
	}
}
