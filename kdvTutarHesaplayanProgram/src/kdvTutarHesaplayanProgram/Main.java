package kdvTutarHesaplayanProgram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double tutar;
		double kdvOran = 0.18;
		double kdvTutar, kdvliTutar;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ücret Tutarını Giriniz: ");
		tutar = scanner.nextDouble();
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar * kdvTutar;
		
		System.out.println("KDV'siz Tutar: " + tutar);
		System.out.println("KDV Oranı: " + kdvOran);
		System.out.println("KDV Tutarı: " + kdvTutar);
		System.out.println("KDV'li Tutarı: " + kdvliTutar);

	}

}
