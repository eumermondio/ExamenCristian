package prueba1;

import java.util.Scanner;

public class Suma {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int suma = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println("Dime numero: ");
			suma += sc.nextInt();
		}
		System.out.println(suma);
	}

}
