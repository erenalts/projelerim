#include <stdio.h>
#include <stdlib.h>

int main() {
    int secim, fsecim;
    double yatirilanTutar, cekilicekTutar, itarife, efatura, sfatura, dgfatura, tfatura;
    double bakiye = 1000.0;
    
    

    while (1) { 
        printf("1 - Bakiye Goruntule\n");
        printf("2 - Para Yatir\n");
        printf("3 - Para cek\n");
        printf("4 - Fatura ode\n");
        printf("5 - Sistemden cik\n");
        printf("Yapmak istediginiz islemi secin: ");
        scanf("%d", &secim);

        switch (secim) {
            case 1: 
                printf("Bakiyeniz: %.2lf TL\n", bakiye);
                break;

            case 2: 
                printf("Yatirmak istedi�iniz tutari giriniz: ");
                scanf("%lf", &yatirilanTutar);
                bakiye += yatirilanTutar;
                printf("Yatirdi�iniz tutar: %.2lf TL\n", yatirilanTutar);
                printf("Hesabinizdaki bakiye: %.2lf TL\n", bakiye);
                break;

            case 3: 
                printf("Hesabinizdan cekmek istediginiz tutari girin: ");
                scanf("%lf", &cekilicekTutar);
                if (cekilicekTutar > bakiye) {
                    printf("Yetersiz bakiye! Mevcut bakiye: %.2lf TL\n", bakiye);
                } else {
                    bakiye -= cekilicekTutar;
                    printf("�ekti�iniz tutar: %.2lf TL\n", cekilicekTutar);
                    printf("G�ncel bakiyeniz: %.2lf TL\n", bakiye);
                }
                break;

            case 4: 
                printf("1 - internet Faturasi\n");
                printf("2 - Elektrik Faturasi\n");
                printf("3 - Su Faturasi\n");
                printf("4 - Dogal Gaz Faturasi\n");
                printf("5 - Telefon Faturasi\n");
                printf("Odemek istediginiz fatura turunu secin: ");
                scanf("%d", &fsecim);

                switch (fsecim) {
                    case 1:
                        printf("�nternet faturasi tutarini giriniz: ");
                        scanf("%lf", &itarife);
                        if (itarife > bakiye) {
                            printf("Yetersiz bakiye!\n");
                        } else {
                            bakiye -= itarife;
                            printf("internet faturasi �dendi. Kalan bakiye: %.2lf TL\n", bakiye);
                        }
                        break;
                    case 2:
                        printf("Elektrik faturasi tutarini giriniz: ");
                        scanf("%lf", &efatura);
                        if (efatura > bakiye) {
                            printf("Yetersiz bakiye!\n");
                        } else {
                            bakiye -= efatura;
                            printf("Elektrik faturasi �dendi. Kalan bakiye: %.2lf TL\n", bakiye);
                        }
                        break;
                    case 3:
                        printf("Su faturasi tutarini giriniz: ");
                        scanf("%lf", &sfatura);
                        if (sfatura > bakiye) {
                            printf("Yetersiz bakiye!\n");
                        } else {
                            bakiye -= sfatura;
                            printf("Su faturasi �dendi. Kalan bakiye: %.2lf TL\n", bakiye);
                        }
                        break;
                    case 4:
                        printf("Do�al gaz faturasi tutar�n� giriniz: ");
                        scanf("%lf", &dgfatura);
                        if (dgfatura > bakiye) {
                            printf("Yetersiz bakiye!\n");
                        } else {
                            bakiye -= dgfatura;
                            printf("Do�al gaz faturasi �dendi. Kalan bakiye: %.2lf TL\n", bakiye);
                        }
                        break;
                    case 5:
                        printf("Telefon faturasi tutarini giriniz: ");
                        scanf("%lf", &tfatura);
                        if (tfatura > bakiye) {
                            printf("Yetersiz bakiye!\n");
                        } else {
                            bakiye -= tfatura;
                            printf("Telefon faturasi �dendi. Kalan bakiye: %.2lf TL\n", bakiye);
                        }
                        break;
                    default:
                        printf("Hatali se�im!\n");
                }
                break;

            case 5: 
                printf("Sistemden c�k�s yapiliyor...\n");
                exit(0); 

            default: 
                printf("Hatali secim yapt�n�z. Lutfen tekrar deneyin.\n");
        }
    }

    return 0;
}

