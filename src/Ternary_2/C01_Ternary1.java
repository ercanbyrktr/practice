package Ternary_2;

import java.util.Scanner;

public class C01_Ternary1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi girin");
        int sayi= scan.nextInt();
        System.out.println(sayi%2==0 ? "cift sayi":"tek sayi");
    }
}
