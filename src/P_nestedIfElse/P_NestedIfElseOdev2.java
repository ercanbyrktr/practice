package P_nestedIfElse;

import java.util.Scanner;

public class P_NestedIfElseOdev2 {
    public static void main(String[] args) {
        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km cinsinden giriniz : ");
        int mesafe= scan.nextInt();

        System.out.println("Cevirmek istediginiz olcu birimini giriniz: ");
        String brm= scan.next();


        if (brm.equalsIgnoreCase("metre")){
            System.out.println("Girdiginiz mesafe'nin metre cinsinden uzunlugu : "+ mesafe*1000);


        } else if (brm.equalsIgnoreCase("cm")||brm.equalsIgnoreCase("santimetre")) {
            System.out.println("Girdiginiz mesafenin cm cinsinden uzunlugu : "+ mesafe*100000);


        }else {
            System.out.println("Istedıgınız birim sistemimizde kayitli degildir.");
        }



    }
}
