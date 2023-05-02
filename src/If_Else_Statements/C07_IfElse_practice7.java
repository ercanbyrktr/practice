package If_Else_Statements;

import java.util.Scanner;

public class C07_IfElse_practice7 {
    public static void main(String[] args) {
         /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi
        30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(cm) giriniz");
        double boy= scan.nextDouble();
        System.out.println("Lütfen kilonuzu(kg) giriniz");
        double kilo= scan.nextDouble();

        double vki= (kilo * 10000 / (boy*boy));
        System.out.println("Vücut kitle indeksiniz : "+vki);

        if (kilo<=0 || boy<=0 || boy>300 || kilo>500){
            System.out.println("Yanlis giris yaptiniz, tekrar deneyiniz");


        }else if (vki<20) {
            System.out.println("zayif");
        } else if (vki<25) {
            System.out.println("Normal");
        } else if (vki<30) {
            System.out.println("Kilolu");
        }else{
            System.out.println("Obez");
        }

    }
}
