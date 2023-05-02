package P_nestedIfElse;

import java.util.Scanner;

public class P_IfElseOdev {
    public static void main(String[] args) {
      /*
         Kullanicidan bir sayi alin
       sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
       sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

     if (!(sayi % 2 == 0) ) {
            if (sayi > 0){
            System.out.println("Girdiginiz sayi pozitif ve tek sayidir.");
             } else {
            System.out.println("Girdiğiniz sayi negatif ve tek sayidir");
        }
    }else if (sayi%2==0){
            if (sayi%10==0){
                System.out.println("sayi 10'un tam katidir.");

            }else{
                System.out.println("sayi 10'un tam kati degildir.");
            }
        }





    }
}
