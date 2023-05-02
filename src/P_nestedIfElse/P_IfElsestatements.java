package P_nestedIfElse;

import java.util.Scanner;

public class P_IfElsestatements {
    public static void main(String[] args) {
        //Kullanicidan 100 uzerinden notunu isteyin
        // notu harf sistemine cevirip yazdirin.
        // <50 ise D 50<not<60 C 60<not<80 B 80 Uzeri A

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (0<not && not<50){
            System.out.println("Notunuz D");
           } else if (50<=not && not<60) {
            System.out.println("Notunuz C");
        } else if (60<= not && not<80) {
            System.out.println("Notunuz B");
        } else if(not>=80 && not<=100) {
            System.out.println("notunuz A");

        }else{
            System.out.println("Lutfen gecerli bir not giriniz");
        }


    }
}
