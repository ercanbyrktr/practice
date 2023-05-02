package While_Loop;

import java.util.Scanner;

public class C02_while_Loop {
    public static void main(String[] args) {
        //Kullanicidan bir sifre isteyin sartlari saglayana kadar
        // her seferinde hatalari söyleyip yeni sifre isteyin
        //sartlari saglayan sifre oldugunda
        // "5. denemenizde basarili sifre olusturuldu" seklinde acıklama yazin
        // ilk harf kucuk harf
        // son harf buyuk harf olmalı
        //bozluk içermemeli
        //8 karakter veya daha uzun olmalı

        Scanner scan=new Scanner(System.in);

        String sifre="";
        int flag=0;
        int denemeSayisi=0;

        while (flag!=4) {
            flag=0;
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            //ilk harf kucuk harf olmali
            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z'){
                flag++;
            } else {
                System.out.println("Ilk karakter harf olmali");
            }
            //son harf buyuk harf olmali
            if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;
            } else {
                System.out.println("Son karakter buyuk harf olmali");
            }
            //bosluk icermemeli
            if (!(sifre.contains(" "))) {
                flag++;
            }
            if (sifre.length() >= 8) {
                flag++;
            } else {
                System.out.println("Uzunluk en az 8 karakter olmali");
            }
            denemeSayisi++;
        }
        System.out.println("Tebrikler! "+denemeSayisi+". denemede sifreniz basari ile kaydedildi");
    }
}
