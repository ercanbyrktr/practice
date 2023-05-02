package P_Stringmanipulation;

import java.util.Scanner;

public class P1_ındexOf_lastIntex {
    public static void main(String[] args) {
        // kullanıcıdan bir cümle alin
        //1-cümlede ev geciyorsa "home home sweet home"
        //2-cümlede is geçiyorsa "calısmak güzeldir"yazdırın
        //3-ikisini de iceriyorsa "hem ev lazım hem is" yazdırın
        //4- hicbirini icermiyorsa "cok calısman lazim" yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yazınız: ");
        String cumle = scan.nextLine();

        if (cumle.contains("is") && cumle.contains("ev")) {
            System.out.println("hem ev lazım hem is");


        } else if (cumle.indexOf("is") != -1) {
            System.out.println("Calismak guzeldir");

        } else if (cumle.indexOf("ev") != -1) {

            System.out.println("home home sweet home");
        } else {
            System.out.println("cok calısman lazım");
        }
    }
}
