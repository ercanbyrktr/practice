package Ternary;

import java.util.Scanner;

public class P2_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin.Sayi pozitifse "Sayi pozitif"
        //negatifse karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));




    }
}
