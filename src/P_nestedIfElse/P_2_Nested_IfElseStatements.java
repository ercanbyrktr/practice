package P_nestedIfElse;

import java.util.Locale;
import java.util.Scanner;

public class P_2_Nested_IfElseStatements {
    public static void main(String[] args) {
        //bir sifre isteyin
        //ilk harf buyuk harf ise "A"olup olmadigini kontrol edin
        // ilk harf "A" ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();

        char ilkharf = sifre.charAt(0);

        if (ilkharf >= 'A' && ilkharf <= 'Z') {
            if (ilkharf == 'A') {
            System.out.println("Gecerli Sifre");
        } else {
            System.out.println("Gecersiz Sifre");
        }


        } else if (ilkharf >='a'&&ilkharf <='z'){
            if (ilkharf == 'z') {
                System.out.println("Gecerli Sifre");

            } else {
                System.out.println("Gecersiz Sifre");

            }
        }else{
        System.out.println("Lutfen ilk karakter icin sadece harf kullanin");
    }


    }


}
