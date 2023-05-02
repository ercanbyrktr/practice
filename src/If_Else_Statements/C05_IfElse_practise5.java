package If_Else_Statements;

import java.util.Scanner;

public class C05_IfElse_practise5 {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliyorsa "5'in kati"
        // sayi hem 3 hem de 5 ile bolunebiliyorsa "3 ve 5'in kati" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi girin");
        int sayi= scan.nextInt();
        if (sayi%5==0 && sayi%3==0){
            System.out.println("3 ve 5'in kati");
        }else if (sayi%5==0){
            System.out.println("5'in kati");
        }else if (sayi%3==0){
            System.out.println("3'ün kati");
        }
    }
}
