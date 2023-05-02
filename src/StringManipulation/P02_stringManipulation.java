package StringManipulation;

import java.util.Scanner;

public class P02_stringManipulation {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz ");
        String isim= scan.next();
        System.out.println("lutfen soyisminizi giriniz ");
        String soyisim= scan.next();

        String isimilkh=isim.toUpperCase().substring(0,1);
        String isimgeriyekalan=isim.toLowerCase().substring(1,isim.length());

        String soyisimilkh=soyisim.toUpperCase().substring(0,1);
        String soyisimgeriyek=soyisim.toLowerCase().substring(1,soyisim.length());

       if((isim.length()-1 ) >( soyisim.length()-1)){
           System.out.println(isimilkh +isimgeriyekalan +" "+ soyisimilkh + soyisimgeriyek);

       }else{
           System.out.println((isimilkh +isimgeriyekalan) + " "+ soyisim.toUpperCase());
    }
}}
