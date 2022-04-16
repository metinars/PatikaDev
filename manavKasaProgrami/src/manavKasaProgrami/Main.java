package manavKasaProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double armut = 2.14, elma = 3.67, domates = 1.11, 
				muz = 0.95, patlican = 5.00;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen Armut kg giriniz: ");
		armut *= scanner.nextDouble();
		
		System.out.print("Lütfen elma kg giriniz: ");
		elma *= scanner.nextDouble();
		
		System.out.print("Lütfen domates kg giriniz: ");
		domates *= scanner.nextDouble();
		
		System.out.print("Lütfen muz kg giriniz: ");
		muz *= scanner.nextDouble();
		
		System.out.print("Lütfen patlican kg giriniz: ");
		patlican *= scanner.nextDouble();
		
		
		double total = armut + elma + domates + muz + patlican;
		
		System.out.print("Toplam: " + total);

	}

}
