package If_Else_Statements;

import java.util.Scanner;

public class C04_IfElse_practice4 {
    public static void main(String[] args) {
        // soru7) Kullanicidan 100 uzerinden notunu isteyin
        // Not'u harf sistemine cevirip yazdirin
        // 50'den kucukse "D",
        // 50 ye esit veya-60 dan kucukse"C",
        // 60 a esit veya -80 den kucukse  "B",
        // 80 e esit veya uzerinde ise "A"
        // gecersiz not girildiginde uyari verelim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar bir not degeri giriniz");
        int not = scan.nextInt();
        if (not < 0 || not > 100) {
            System.out.println("Lütfen gecerli bir not giriniz");
        } else if (not < 50) {
            System.out.println("DD");
        } else if (not < 60) {
            System.out.println("CC");
        } else if (not < 80) {
            System.out.println("BB");
        } else if (not > 80) {
            System.out.println("AA");
        }
    }
}