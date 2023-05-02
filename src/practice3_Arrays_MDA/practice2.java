package practice3_Arrays_MDA;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        String str = "Java candir can, bundan suphesi olan var mi?";

        String[] kelimeler=str.split(" ");
        System.out.println(kelimeler.length);

        int enUzunKelimeLength=kelimeler[0].length();

        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length() > enUzunKelimeLength) {
                enUzunKelimeLength = kelimeler[i].length();
            }
        }

        //bir String'i karakterlerine ayırmak istersek:

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakterler sayisi: " + karakterler.length);
    }
}
