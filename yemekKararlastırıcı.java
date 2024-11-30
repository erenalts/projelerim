package buGunNeYapsam;

import java.util.Random;
import java.util.Scanner;

public class yemekKararlastırıcı {

	public static void main(String[] args) {
		/* Bu gün ne yesem, ne içsem ya da bu akşam için ne yapsam sorusuna cevap veren bir program yazdım */
		
		while(true) {
		
		Scanner ys = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("---Yemek tercih aracına hoşgeldinz---");
		String[] yemek = {"doner","Pizza","Makarna","Hamburger","Kebap","Ciger","Pide" }; 
		String[] icecek = {"Cay","kahve","Sicak Cikolata",""};
		
		System.out.println("Yemek karari için 1'i, icecek tercihi için 2'yi seçin ");
		int secim = ys.nextInt();
		
		
		
		 if (secim == 1) {
	            
	            int rastgeleYemek = random.nextInt(yemek.length);
	            System.out.println("Bugünkü yemek önerim: " + yemek[rastgeleYemek]);
	        } else if (secim == 2) {
	            
	            int rastgeleIcecek = random.nextInt(icecek.length);
	            System.out.println("Bugünkü içecek önerim: " + icecek[rastgeleIcecek]);
	        } else {
	            
	            System.out.println("Hatalı seçim yaptınız. Lütfen 1 veya 2 girin.");
	        }

			
		
		}
	}

}
