package If_Else_Statements;

import java.util.Scanner;

public class C03_IfElse_practice2 {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc kenar uzunlugunu giriniz ,her birinden sonra enter'a basiniz");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2&&kenar2==kenar3&&kenar1>0){
            System.out.println("Eskenar ucgen");
        }
    }
}
