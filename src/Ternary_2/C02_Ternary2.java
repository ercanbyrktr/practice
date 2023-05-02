package Ternary_2;

import java.util.Scanner;

public class C02_Ternary2 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        int sayi= scan.nextInt();

        System.out.println(sayi<0 ? (-1*sayi):sayi);
    }
}
