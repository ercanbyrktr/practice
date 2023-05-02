package P_nestedIfElse;

import java.util.Scanner;

public class P_Eyt {
    public static void main(String[] args) {
             /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
             KURALLAR
             : 1999 yılı 09.ay öncesi ise baslamis olmak
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz : ");
        char cinsiyet=scan.next().toLowerCase().charAt(0);
        System.out.println("lutfen ise baslama tarihinizi ay ve yıl olarak giriniz : ");
        double yil= scan.nextDouble();
        System.out.println("Lutfen prim gün sayinizi giriniz: ");
        int primGun= scan.nextInt();
        if (cinsiyet=='k'){
            if (yil>20 || primGun<5000){
                System.out.println("Emekli olmak için "+(5000-primGun)+ " gün daha calısmalısın");

            } else if (primGun>=5000 && yil>=20) {
                System.out.println("Tebrikler EYT ile emekli olmaya hak kazandınız.");

            } else if(cinsiyet=='e') {
                if  (yil<1999.09 || primGun<5500){
                System.out.println("Emekli olmak için "+(5500-primGun)+ " gün daha calısmalısın");

            } else {
                System.out.println("emekli olmaya hak kazandınız.");

            }
        }


    }
}}
