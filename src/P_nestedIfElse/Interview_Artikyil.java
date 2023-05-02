package P_nestedIfElse;

import java.util.Scanner;

public class Interview_Artikyil {
    public static void main(String[] args) {
        // Interview Question
        //Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        //Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        //Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        //Kural 3: 4’un kati olmasina ragmen
        // 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz: ");
        int yil= scan.nextInt();

        if (yil%4!=0){
            System.out.println("Artik yil degil");

        } else if (yil%100!=0) {
            System.out.println("Artik yildir");


        } else if (yil%400==0) {
            System.out.println("Artik yildir.");

        }else{
            System.out.println("Artik yil değildir");
        }

        if (yil%100==0 && yil%400==0 || yil%100!=0 && yil%4==0){
            System.out.println("Girdiğiniz yıl Artık Yıl'dir.");

         }else{
            System.out.println("Girdiginiz yil Artik yil degildir");
        }
}}
