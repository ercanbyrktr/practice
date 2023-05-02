package Team8;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        //Nested If Statements Sorular Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet=='E'){
            if (yas<0 || yas>85){
                System.out.println("Gecersiz yas girisi yaptınız.");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin "+(65-yas)+" yıl daha calısmalısın");
            }else{
                System.out.println("Emekli olabilirsiniz.");
            }

        } else if (cinsiyet=='K') {
            if (yas<0 || yas>85){
                System.out.println("Gecersiz yas girisi yaptınız.");
            } else if (yas<60) {
                System.out.println("Emekli olmak icin "+(60-yas)+" yıl daha calısmalısın");
            }else{
                System.out.println("Emekli olabilirsiniz.");
            }
        }else{
            System.out.println("Gecerli bir tercih giriniz ");
        }
    }
}
