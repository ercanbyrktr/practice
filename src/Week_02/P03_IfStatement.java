package Week_02;

import java.util.Scanner;

public class P03_IfStatement {
    public static void main(String[] args) {
      //  2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
      //  Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
      //  Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
      //  küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
      //  Ad:
      //  Soyad:
      //  1.Vize:
      //  2. Vize:
      //  Final :
      //  Yıl Sonu Notu:
      //  Ders Durumu :

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz :");
        String name=scan.next();
        System.out.print("Lutfen soyadinizi giriniz :");
        String surname= scan.next();
        System.out.println("Lutfen vize ve final notlarinizi giriniz");
        System.out.println("1.Vize Notu: ");
        double vize1= scan.nextDouble();
        System.out.print("2.Vize Notu: ");
        double vize2= scan.nextDouble();
        System.out.print("Final Notu: ");
        double finalnotu= scan.nextDouble();
        double yilSonuNotu = (((vize1 + vize2) / 2) * 40 / 100) + (finalnotu * 60 / 100);
        System.out.println("Adınız : " + name);
        System.out.println("Soyadınız : " + surname);
        System.out.println("1. Vize : " + vize1);
        System.out.println("2. Vize : " + vize2);
        System.out.println("Final : " + finalnotu);
        System.out.println("Yıl Sonu Notu : " + yilSonuNotu);
        if (yilSonuNotu >= 50) {
            System.out.println("Ders Durumu : Geçtiniz Tebrikler");
        }
        if (yilSonuNotu < 50) {
            System.out.println("Ders Durumu : Maalesef Kaldınız!");
        }




    }
}
