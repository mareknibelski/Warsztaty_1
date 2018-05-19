package gra_w_zgadywanie;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class gra_w_zgadywanie {

	public static void main(String[] args) {

		Random number = new Random();
		int a = number.nextInt(100) + 1;
		System.out.println(a);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Zgadnij liczbę");

		int b = 0;

		while (a != b) {
			try {
				b = scanner.nextInt();
				
				if (b > a) {
					System.out.println("Za dużo!");
					System.out.println("Zgadnij liczbę");
					b = scanner.nextInt();
				} else if (b < a){
					System.out.println("Za mało!");
					System.out.println("Zgadnij liczbę");
					b = scanner.nextInt();
				} else if (a == b){
					System.out.println("Zgadłeś!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Liczba nie jest typu int " + e.getMessage());
				System.out.println("Wpisz prawidłowy format int");
				scanner.next();
			}
		}
	}
}
