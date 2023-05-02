package P_Stringmanipulation;

import java.util.Scanner;

public class P3_contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        String k1="kucuk";
        String k2="buyuk";

        if (cumle.contains(k1)){
            System.out.println(cumle.toLowerCase());

        }else if (cumle.contains(k2)) {
            System.out.println(cumle.toUpperCase());

        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");

        }
    }
}
