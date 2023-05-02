package Team8;

import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {

      //  Kullanicidan gunu ismini girmesini isteyin,
         //       girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
       // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        //girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gün numarasi giriniz:");
        int gunNo= scan.nextInt();
        switch (gunNo) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("simdi calışma zamanı tatile " + (6 - gunNo) + " kaldı");
                break;
            case 6:

            case 7:
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("**Lutfen gecerli bir gun numarasi giriniz.**");
        }
    }
}
