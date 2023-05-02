package While_Loop;

import java.util.Scanner;

public class C01_while_Loop {
    public static void main(String[] args) {
        //Kullanicidan toplanmak uzere sayilar alın
        //toplam 500'ü asınca
        //kac sayi girdigini ve sayilarin toplamini yazdirin
        Scanner scan=new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        int girilenSayiAdedi=0;

        while (toplam<500){//toplam 500 den kucuk oldugu sure boyunca
            System.out.println("Toplanmak uzere bir tamsayi giriniz");

            girilenSayi= scan.nextInt();

            toplam+=girilenSayi;

            girilenSayiAdedi++;

        }
        System.out.println("Toplam"+girilenSayiAdedi+"adet sayi girildi ve toplami : "+toplam);

    }
}
