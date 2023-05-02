package P_nestedIfElse;

import java.util.Scanner;

public class P_4_Nested {
    public static void main(String[] args) {

        // 4 basamakli sayi isteyin
        //girdiği sayı 5'e bolunuyorsa son rakamını kontrol edin
        //0 ise çift sayi
        //0 degil ise '5'e bolunen tek sayı yazdırın
        // 5 e bolunmuyorsa ekrana tekrar deneyin yazdirin.

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        double sayi= scan.nextDouble();
        
        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen gecerli bir sayi giriniz");

            
        } else if(sayi % 5 == 0){
            if (sayi % 10==0){
                System.out.println("5'e bolunen cift sayi");

            }else{
                System.out.println("5'e bolunen tek sayi");

            }

        }else{
            System.out.println("TEKRAR DENEYINIZ");

        }


    }
}
