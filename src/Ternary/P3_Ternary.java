package Ternary;

import java.util.Scanner;

public class P3_Ternary {
    public static void main(String[] args) {
//kullanicidan bir sayi aliniz
        //pozitif ise yazdır
        //degilse sayi<=0 ise bir sayi daha isteyip ikisinin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi= scan.nextDouble();

       if(sayi>0){
           System.out.println(sayi);
       }else{
           System.out.println("Lutfen bir sayi daha giriniz");
           double sayi2= scan.nextDouble();
           System.out.println(sayi*sayi2);
       }



    }
}
