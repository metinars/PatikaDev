package taksimetreProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double kmUcreti = 2.20;
		
		double km, total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen gitmek istediğiniz mesafeyi giriniz: ");
		km = scanner.nextInt();
		
		total = (km * kmUcreti) + 10;
		
		if (total < 20) {
			System.out.println("Toplam tutar: 20");
		} else {
			System.out.println("Toplam tutar: " + total);
		}
	}

}
