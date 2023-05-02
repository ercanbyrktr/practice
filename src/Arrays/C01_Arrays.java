package Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        String[] isimler = {"Nurefsan", "Berke", "Mustafa" };
        int[] sayilar = {3, 4, 5, 6, 7, 8, 9, 6, 8, 9};
        char[] karakterler = {'e', '*', '9', 'q'};

        //Array non primitive data turlerindendir
        //Eger lıste seklinde olusturmayıp new keyword kullanıyorsak
        // uzunlugunu yazmak zorundayız


        String[] arr=new String[5];

        //Bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz

        //Bir arrayi yazdirmak istersek
        //Arrayler direk yazdirilamaz
        System.out.println(Arrays.toString(isimler));

        System.out.println(Arrays.toString(arr));

        int[] a=new int[7];
        System.out.println(Arrays.toString(a));

        //arraydeki elementlere nasil ulaşırız ? index ile

        a[0]=4;//[4, 0, 0, 0, 0, 0, 0]
        a[3]=7;//[4, 0, 0, 7, 0, 0, 0]
        a[6]=8;//[4, 0, 0, 7, 0, 0, 8]

        System.out.println(Arrays.toString(a));


        // Array'in uzunlugu degistirilmez method da olmaz.

        //sayilar arrayinin 4. indeksindeki elementi yazdırın
        System.out.println(sayilar[4]);//7

        //isimler arrayinin 1. indexi
        System.out.println(isimler[1]);//Berke

    }
}
