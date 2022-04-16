package daireAlanHesabi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yariCap;
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dairenin yarı çapını giriniz: ");
		yariCap = scanner.nextInt();
		
		double alan = pi * yariCap * yariCap;
		double cevre = 2 * pi * yariCap;
		
		System.out.println("Dairenin alanı: " + alan);
		System.out.println("Dairenin çevresi: " + cevre);

	}

}
