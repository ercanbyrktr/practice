package P_Stringmanipulation;

import java.util.Scanner;

public class P2_soru_ilkindex_sonindex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();


        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex==(-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex==lastIndex) {
            System.out.println("Aradıgınız kelime cumlede 1 kere kullanılmıs");
        }else {
            System.out.println("aradıgınız kelime cumlede 1'den fazla kullanılmıs");
        }




    }
}
