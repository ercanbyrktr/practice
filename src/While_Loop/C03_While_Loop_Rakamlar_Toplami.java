package While_Loop;

import java.util.Scanner;

public class C03_While_Loop_Rakamlar_Toplami {
    public static void main(String[] args) {
        //While loop ile kullanicidan alinan sayinin rakamlar toplamini bulun
        Scanner scan=new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi>0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println("Girilen "+ girilenSayi +"'nin rakamlar toplami : "+rakamlarToplami);

    }
}
