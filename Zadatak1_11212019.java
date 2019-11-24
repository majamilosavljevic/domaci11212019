package domaci_11212019;

import java.util.Scanner;

public class Zadatak1_11212019 {

	public static int[] createArray(int n, String arrayName) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza:");
			array[i] = scan.nextInt();
		}
		/*
		 * System.out.println("Elementi " + arrayName + " su: "); for (int i = 0; i <
		 * array.length; i++) { System.out.print(array[i] + " "); }
		 * System.out.println();
		 */
		return array;
	}

	public static int[] elementsDivisibleBy3(int[] array, String arrayName) {
		String result = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				result += array[i] + " ";
			}
		}
		if (result == "") {
			System.out.println("Nijedan element " + arrayName + " nije deljiv sa 3");
		} else {
			System.out.println("Elementi " + arrayName + " deljivi sa 3: ");
			System.out.println(result);
		} 
		return array;
	}

	public static int[] elementsDivisibleBy5(int[] array, String arrayName) {
		String result = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0) {
				result += array[i] + " ";
			}
		}
		if (result == "") {
			System.out.println("Nijedan element " + arrayName + " nije deljiv sa 5");
		} else {
			System.out.println("Elementi " + arrayName + " deljivi sa 5: ");
			System.out.println(result);
		}
		return array;
	}

	public static void main(String[] args) {

		/*
		 * Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu). Napisati
		 * zasebno 2 metode Prva metoda ispisuje elemente niza koji su deljivi sa 3
		 * Druga metoda ispisuje elemente niza koji su deljivi sa 5
		 */

		Scanner scan = new Scanner(System.in);
		int n = 0;
		while (n <= 1) {
			System.out.println("Unesite duzinu prvog niza (min 2): ");
			n = scan.nextInt();
		}
		int[] array1 = createArray(n, "prvog niza");
		elementsDivisibleBy3(array1, "prvog niza");
		elementsDivisibleBy5(array1, "prvog niza");

		int n1 = 0;
		while (n1 <= 1) {
			System.out.println("Unesite duzinu prvog niza (min 2): ");
			n1 = scan.nextInt();
		}
		int[] array2 = createArray(n1, "drugog niza");
		elementsDivisibleBy3(array2, "drugog niza");
		elementsDivisibleBy5(array2, "drugog niza");
	}
}
