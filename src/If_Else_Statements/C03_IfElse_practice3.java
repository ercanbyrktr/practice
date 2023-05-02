package If_Else_Statements;

import java.util.Scanner;

public class C03_IfElse_practice3 {
    public static void main(String[] args) {
        // Kullanicidan notunu alin
        //  50 veya daha buyukse ”Sinifi Gectin”,
        //  50’den kucukse “Maalesef kaldin” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int not= scan.nextInt();
        if (not>=50 && not<100){
            System.out.println("Sinifi gectin");
        }if (not<50){
            System.out.println("Maalesef kaldin");
        }
    }
}
