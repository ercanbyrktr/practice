package P_nestedIfElse;

import java.util.Scanner;

public class P_1NestedIfElse {
    public static void main(String[] args) {
        // kullanicidan gun ismi isteyin
        // girilen gun gecerli ise gun isminin 1. 2. ve 3. harflerini yazdririn
        // ilk harf buyuk digerleri kucuk olarak yazdirin
        //gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun= scan.next().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        }else if (gun.equals("persembe")){
            System.out.println("Per");
        }else if (gun.equals("cuma")){
                System.out.println("Cum");
                
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
            
        } else if (gun.equals("pazar")) {
            System.out.println("Paz");

        }else {
            System.out.println("Lutfen gecerli bir gun giriniz");


    }


    }
}
