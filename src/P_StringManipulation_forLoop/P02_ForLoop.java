package P_StringManipulation_forLoop;

import java.util.Scanner;

public class P02_ForLoop {
    public static void main(String[] args) {
       // Soru 5-Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir pozitif sayi giriniz : ");
        int sayi= scan.nextInt();
        int faktoriyel=1 ;


            for (int i = sayi; i >=1; i--) {
                faktoriyel *=i;
              if(i != 1){
                  System.out.print(i +" * ");
            }else{
                  System.out.print(i +" ");
                  System.out.print(" = "+faktoriyel);
              }

        }
    }
}
