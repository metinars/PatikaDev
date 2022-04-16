package vucutKitleIndeks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double boy, kilo;
		
		double kitleIndex;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
		boy = scanner.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = scanner.nextDouble();
		
		kitleIndex = kilo / (boy * boy);
		
		System.out.println("Vucut kitle indeksiniz: " + kitleIndex);
		
		
	}

}
