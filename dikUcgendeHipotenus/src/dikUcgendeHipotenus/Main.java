package dikUcgendeHipotenus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int aKenari, bKenari;
		double cKenari;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen a kenarını giriniz: ");
		aKenari = scanner.nextInt();
		
		System.out.print("Lütfen b kenarını giriniz: ");
		bKenari = scanner.nextInt();
		
		cKenari = Math.sqrt((aKenari * aKenari) + (bKenari * bKenari));
		System.out.println("Hipotenüs: " + cKenari);

	}

}
