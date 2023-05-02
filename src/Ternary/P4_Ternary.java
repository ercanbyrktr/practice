package Ternary;

import java.util.Scanner;

public class P4_Ternary {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin
        //kücük harf ise
        // buyuk harf ise
        //degilse "girdiginiz karakter harf degildir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        String sonuc= (harf>='a' && harf<='z')  ?  ("Kucuk Harf") : ((harf>='A' && harf<='Z') ? "Buyuk harf" : "Gecersiz karakter");

        System.out.println(sonuc);






    }


}
