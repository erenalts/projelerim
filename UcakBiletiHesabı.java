package UcakBiletiHesabı;

import java.util.Scanner;

public class UcakBiletiHesabı {

	public static void main(String[] args) {
		
		/* Km başına 100₺
		 * 10 yaşından küçüklere %50 
		 * 11 ile 18 yaş arasına ve 65 yaşından büyüklere %30 indirim 
		 * gidiş dönüş alınırsa ekstra %20 indirim  */
		
		Scanner ucus = new Scanner(System.in);
		int km,yas,tur,yolcuSayisi;
		double normalFiyat, yasIndirimi,turIndirimi;
		
		System.out.println("Mesafeyi giriniz: ");
		km = ucus.nextInt();
		
		System.out.println("Yaşınızı giriniz: ");
		yas = ucus.nextInt();
		
		System.out.println("Yolculuk türünü seçiniz \n1-Tek gidiş \t2-Gidiş/Dönüş");
		
		tur = ucus.nextInt();
		if(km > 0 && yas > 0 && (tur==1 || tur==2)) {
			
			normalFiyat = km * 100;
			if(yas <= 10) {
				yasIndirimi = km * 50;
				normalFiyat = normalFiyat-yasIndirimi;
				
			}else if(yas >= 11 && yas <=18 && yas >= 65) {
				yasIndirimi = normalFiyat * 70;
				normalFiyat -= yasIndirimi;
			}else {
					yasIndirimi = 0;
					}
			if(tur == 2) {
			turIndirimi = normalFiyat*0.20;
			normalFiyat = (normalFiyat - turIndirimi) * 2;
			}
			System.out.println("Toplam tutar: " + normalFiyat + "₺");
		}else {
			System.out.println("Girdiğiniz bilgiler yanlış");
		}
		
		
 
	}

}
