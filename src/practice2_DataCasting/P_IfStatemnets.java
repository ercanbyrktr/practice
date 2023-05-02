package practice2_DataCasting;

import java.util.Scanner;

public class P_IfStatemnets {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();


        if (yas >= 65 && yas<100) {

            System.out.println("Emekli olabilirsin");

        }else{
            System.out.println("Emekli olmak icin "+ (65-yas) +" yil daha calismalisin.");}


        }
    }
