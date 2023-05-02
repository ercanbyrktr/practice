package P_nestedIfElse;

import java.util.Scanner;

public class P_5_nested_ifelse {
    public static void main(String[] args) {
        //-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("Musteri kartınız var mı");
        String mstkrt = scan.next();
        mstkrt = "evet";

        System.out.println("Lutfen urun adedi giriniz : ");
        int urun = scan.nextInt();
        System.out.println("Liste fiyatini giriniz : ");
        int fiyat = scan.nextInt();

        if (mstkrt == "evet") {
            if (urun > 10) {
                System.out.println("musteri indiriminiz : " + fiyat%20);

            } else if (urun < 10) {
                System.out.println("musteri indiriminiz : " + fiyat%10);

            }

        } else {
            if (!(mstkrt == "evet"))
                if (urun > 10) {
                    System.out.println("musteri indiriminiz : " + fiyat % 15);

                } else {
                    System.out.println("musteri indiriminiz : " + fiyat % 10);


                }
        }
    }
}
