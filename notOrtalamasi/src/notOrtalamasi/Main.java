package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen matematik notunuzu giriniz: ");
		matematik = scanner.nextInt();
		
		System.out.println("Lütfen fizik notunuzu giriniz: ");
		fizik = scanner.nextInt();
		
		System.out.println("Lütfen kimya notunuzu giriniz: ");
		kimya = scanner.nextInt();

		System.out.println("Lütfen türkce notunuzu giriniz: ");
		turkce = scanner.nextInt();
		
		System.out.println("Lütfen tarih notunuzu giriniz: ");
		tarih = scanner.nextInt();
		
		System.out.println("Lütfen müzik notunuzu giriniz: ");
		muzik = scanner.nextInt();
		
		double result = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
		
		System.out.println(result);
		
	}

}
