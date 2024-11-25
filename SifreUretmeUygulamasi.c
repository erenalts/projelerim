#include <stdio.h>  //programýn standart giriþ-çýkýþ iþlevlerini saðlayan baþlýk dosyasýný dahil eder.
#include <stdlib.h> // Bellek yönetimi, dönüþüm iþlemleri ve rastgele sayý üretimi gibi çeþitli iþlevler saðlar.
#include <string.h> //diziler ve karakter dizileriyle çalýþmayý saðlar
#include <time.h> //Zamanla ilgili iþlemler ve ölçümler yapmak için kullanýlýr.
#include <unistd.h>



int main(int argc, char *argv[]) {
	printf("uzunluk:"); //kullanýcýdan parola uzunluðunu girmesini istedim
	
	int uzunluk;
	scanf("%d",&uzunluk); // kullanýcýnýn giriþ yapmasýný saðladým
	
	if (uzunluk <= 8){ // þifrenin 8 karakterden kýsa olmamasý için ef else yapýsýný kullandým
		printf("sifre uzunlugu birden buyuk olmalidir\n");
		
		return 1;
	}
	
	char *parola = malloc(uzunluk + 1); // malloc fonksiyonu bellekte istenilen kadar yer ayýrýr bu alaný da baþlangýç adresine dönþtürür
	
	char *rakamlar = "0123456789"; // stringin baþlangýç adresini tutar
	int rakamlar_uzunlugu = strlen(rakamlar); // rakamlarda 10 karakter olduðu için rakamlarý uzunluðu 10 olarak belirlendi
	
	char *kharfler = "abcdefghijklmnoprstuvyz";
	int kharfler_uzunlugu = strlen(kharfler);
	
	char *bharfler = "ABCDEFGHIJKLMNOPRSTUVYZ";
	int bharfler_uzunlugu = strlen(bharfler);
	
	char *semboller = "!'^+&/()=?_^>£#${[]}";
	int semboller_uzunlugu = strlen(semboller);
	
	srand(time(NULL) + getpid()); //rand fonksiyonu rastgele sayý üretir getpid her seferinde farklý iþlem yapýlmasýný saðlar
	
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
		
	parola[uzunluk] = '\0'; // '\0' stringin sonunu belirlemek için kullanýlýr
	
	printf("Parolanýz: %s\n",parola);
	
	
	free(parola);
	
	return 0;
}
