#include <stdio.h>  //program�n standart giri�-��k�� i�levlerini sa�layan ba�l�k dosyas�n� dahil eder.
#include <stdlib.h> // Bellek y�netimi, d�n���m i�lemleri ve rastgele say� �retimi gibi �e�itli i�levler sa�lar.
#include <string.h> //diziler ve karakter dizileriyle �al��may� sa�lar
#include <time.h> //Zamanla ilgili i�lemler ve �l��mler yapmak i�in kullan�l�r.
#include <unistd.h>



int main(int argc, char *argv[]) {
	printf("uzunluk:"); //kullan�c�dan parola uzunlu�unu girmesini istedim
	
	int uzunluk;
	scanf("%d",&uzunluk); // kullan�c�n�n giri� yapmas�n� sa�lad�m
	
	if (uzunluk <= 8){ // �ifrenin 8 karakterden k�sa olmamas� i�in ef else yap�s�n� kulland�m
		printf("sifre uzunlugu birden buyuk olmalidir\n");
		
		return 1;
	}
	
	char *parola = malloc(uzunluk + 1); // malloc fonksiyonu bellekte istenilen kadar yer ay�r�r bu alan� da ba�lang�� adresine d�n�t�r�r
	
	char *rakamlar = "0123456789"; // stringin ba�lang�� adresini tutar
	int rakamlar_uzunlugu = strlen(rakamlar); // rakamlarda 10 karakter oldu�u i�in rakamlar� uzunlu�u 10 olarak belirlendi
	
	char *kharfler = "abcdefghijklmnoprstuvyz";
	int kharfler_uzunlugu = strlen(kharfler);
	
	char *bharfler = "ABCDEFGHIJKLMNOPRSTUVYZ";
	int bharfler_uzunlugu = strlen(bharfler);
	
	char *semboller = "!'^+&/()=?_^>�#${[]}";
	int semboller_uzunlugu = strlen(semboller);
	
	srand(time(NULL) + getpid()); //rand fonksiyonu rastgele say� �retir getpid her seferinde farkl� i�lem yap�lmas�n� sa�lar
	
	int i;
	for (i = 0; i < uzunluk; i++){
		int karakterturu = rand() % 4;
		
		if( karakterturu == 0){
			parola[i] = rakamlar[rand() % rakamlar_uzunlugu];
		}
		else if (karakterturu == 1){
			parola[i] = kharfler[rand() % kharfler_uzunlugu];
		}
		else if (karakterturu == 2){
			parola[i] = bharfler[rand() % bharfler_uzunlugu];
			
		}
		else {
			parola[i] = semboller[rand() % semboller_uzunlugu];
		}
		
		}
		
	parola[uzunluk] = '\0'; // '\0' stringin sonunu belirlemek i�in kullan�l�r
	
	printf("Parolan�z: %s\n",parola);
	
	
	free(parola);
	
	return 0;
}
