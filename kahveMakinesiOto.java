import java.util.Scanner;

public class kahveMakinesiOto{

    /* Kahve çeşiti ve şeker miktarı seçimi yapan sonrasına ekrana yazdıran bir program yazdım */
    



    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException { 
       
        String kahveSecenekleri = //kahve seçenekleri için değişkenleri tanımladım
        "1 - Dibek kahvesi\n" +
        "2 - Menengic Kahvesi\n" +
        "3 - Corekotu Kahvesi\n" +
        "4 - Latte\n" +
        "5 - Americano";

        Scanner kahve = new Scanner(System.in); //kullanıcı girişi için Scanner oluşturdum
       
        

        
        System.out.println(kahveSecenekleri);   //kahve seçeneklerini ekrana yazdırdım
        System.out.println("Istediginiz kahvenin numasini seciniz");
        int kahvesecimi = kahve.nextInt();

        String seker =  "A - Sekersiz\n" +   //Şeker seceklerini tanımladım
                        "B - Az sekerli\n" +
                        "C - Orta sekerli\n" +
                        "D - Sekerli";

        System.out.println(seker);
        System.out.println("Seker durumunu seciniz");
        
        kahve.nextLine();
        String sekersecimi = kahve.nextLine();
        String secim= " ";
        
        if(sekersecimi.equals("A")) // String değerleri karşılaştırmada equals kullanılır seker seçimi
        {
            System.out.println("Sekersiz");
        }
        else if(sekersecimi.equals("B")) 
        {
            System.out.println("Az sekerli");
        }
        else if(sekersecimi.equals("C")) 
        {
            System.out.println("Orta sekerli");
        }
        else if(sekersecimi.equals("D")) 
        {
            System.out.println("Sekerli");
        }
        else
        {
            System.out.println("Seker secimini hatali yaptiniz tekrar seker secimi yapin");
        }

        switch(kahvesecimi){ // Seçeneklerin seçildiği değişkenlerin birleştirildiği çıktının alındığı kısım
            case 1: System.out.println("Kahveniz hazirlaniyor...");
                Thread.sleep(1000); //1000 değeri 1 saniyeye eşittir kullanıcı 2 saniye boyunca burada bekletilecek
                String bildirim = secim + "Dibek kahveniz hazir\n" + " Afiyet olsun"; 
                System.out.println(bildirim);
                break;
            
            case 2: System.out.println("Kahveniz hazirlaniyor...");
                Thread.sleep(1000); 
                String bildirim2 = secim + "Menengic kahveniz hazir\n" + " Afiyet olsun"; 
                System.out.println(bildirim2);
                break;

            case 3: System.out.println("Kahveniz hazirlaniyor...");
                Thread.sleep(1000); 
                String bildirim3 = secim + "Corekotu kahveniz hazir\n" + " Afiyet olsun"; 
                System.out.println(bildirim3);
                break;

            case 4: System.out.println("Kahveniz hazirlaniyor...");
                Thread.sleep(1000); 
                String bildirim4 = secim + "Latteniz hazir\n" + " Afiyet olsun"; 
                System.out.println(bildirim4);
                break;

            case 5: System.out.println("Kahveniz hazirlaniyor...");
                Thread.sleep(1000); 
                String bildirim5 = secim + "Americanonuz hazir\n" + " Afiyet olsun";
                System.out.println(bildirim5);
                break;

            default: System.out.println("Kahve seciminiz hatalidir");
            kahve.close(); //scanner'ı kapattım
        }

        
        
        
        






        


    
        
    }

}