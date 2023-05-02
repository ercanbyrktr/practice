package Switch_Practice;

import java.util.Scanner;

public class C01_Switch_practice1 {
    public static void main(String[] args) {
        //kullanicidan bir harf isteyin o harf ile baslayan gun ismi varsa yazdırın
        // yoksa gecersiz harf yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        harf=Character.toUpperCase(harf);

        switch (harf){
            case 's':
                System.out.println("Sali");
                break;
            case 'c':
                System.out.println("Carsamba,Cuma veya Cumartesi");
                break;
            case 'p':
                System.out.println("Pazartesi,Persembe veya Pazar");
            default:
                System.out.println("Gecersiz harf");
        }
    }
}
