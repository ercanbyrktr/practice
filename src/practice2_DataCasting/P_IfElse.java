package practice2_DataCasting;

import java.util.Scanner;

public class P_IfElse {
    public static void main(String[] args) {
        //-Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz" );
        char krk=scan.next().charAt(0);
        if ('A'<= krk && krk<='Z') System.out.println("Buyuk Harf");
        if(!('A'<= krk && krk<='Z')){
            System.out.println("Buyuk Harf degildir.");

    }
}}
