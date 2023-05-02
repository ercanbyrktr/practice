package P_nestedIfElse;

import java.util.Scanner;

public class P_3_IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli bir yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olmak icin " + (65 - yas) + " yıl daha calismalisin");
            } else {
                System.out.println("Emekli Olabilirsiniz");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli bir yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olmak icin " + (60 - yas) + " yıl daha calismalisin");
            } else {
                System.out.println("Emekli Olabilirsiniz");
            }
        } else {
            System.out.println("Lutfen gecerli bir tercih giriniz");
        }
    }


}


