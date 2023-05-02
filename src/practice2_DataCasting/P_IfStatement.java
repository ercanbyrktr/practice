package practice2_DataCasting;

import java.util.Scanner;

public class P_IfStatement {
    public static void main(String[] args) {
       // kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       // Ornek:   gun= Pazar   output = "Hafta sonu"
       // gun=sali     output = "Hafta ici"
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gün ismi giriniz");
        String girilengun= scan.next().toLowerCase();

        if (girilengun.equals("pazar") || girilengun.equals("cumartesi"))
                System.out.println("Hafta Sonu");

        if(girilengun.equals("pazartesi") || girilengun.equals("sali") ||
            girilengun.equals("carsamba") || girilengun.equals("persembe") || girilengun.equals("cuma"))
                 System.out.println("Hafta Ici");

        if (!(girilengun.equals("pazar") || girilengun.equals("cumartesi")|| girilengun.equals("pazartesi") ||
            girilengun.equals("sali") ||
            girilengun.equals("carsamba") || girilengun.equals("persembe") || girilengun.equals("cuma"))){

                 System.out.println("lutfen gecerli bir gun giriniz");
            }

        }


    }

