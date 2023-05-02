package Week_02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {
        /*
        1-Int olarak verilen 3 sayinin toplamını double olarak yazdırın
        ipucu: double>float>long>int>short>byte
         */

      //  double a=3, b=9, c=7;
      // double toplam=(a+b+c);
       // System.out.println("toplam ="+(int)toplam);


         /*
     2-  Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
     Girdiğiniz harf :
     Girdiğiniz harften sonraki  3 harf :
     şeklinde yazdrın.
     ipucu: char
         */
     // Scanner scan=new Scanner(System.in);
     // System.out.println("Lutfen bir harf giriniz");
     // char harf=scan.next().charAt(0);
     // System.out.println("Girdiginiz harf : "+harf);

     // System.out.println("Girdiginiz harften sonraki 3 harf : "+(char)(harf+1)+", "+(char)(harf+2)+", "+(char)(harf+3));

        /*
       3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
        ipucu: sorumluluk bende
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ondalıklı sayi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("Lutfen ikinci bir sayi giriniz");
        double sayi2=scan.nextDouble();

        System.out.println((int)(sayi1/sayi2));

    }


}
