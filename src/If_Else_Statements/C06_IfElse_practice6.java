package If_Else_Statements;

import java.util.Scanner;

public class C06_IfElse_practice6 {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin 60 yas ve üzeri , Erkek 65 yas ve üzeri emekli olabilir
        Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak icin .. yil daha calisman gerek" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz");
        char cins=scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi giriniz");
        int yas= scan.nextInt();
        if ((cins=='K' && yas>60) || (cins=='E' && yas>65)){
            System.out.println("Emekli olabilirsin");
        } else if (cins=='K') {
            System.out.println("emekli olmak icin"+(60-yas)+ "yıl daha calismalisin");
        } else if (cins=='E') {
            System.out.println("emekli olmak icin"+(65-yas)+"yıl daha calismalisin");
        }
    }
}
