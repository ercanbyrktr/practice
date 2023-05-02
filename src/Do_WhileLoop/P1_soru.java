package Do_WhileLoop;

import java.util.Scanner;

public class P1_soru {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.

        int sayi = 9;

        do {
            sayi++;
            if (sayi % 7 == 0) {

                System.out.print (sayi + " ");
            }
        } while (sayi < 190);


    }
}