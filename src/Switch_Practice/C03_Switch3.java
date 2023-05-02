package Switch_Practice;

import java.util.Scanner;

public class C03_Switch3 {
    public static void main(String[] args) {
        //Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasindaki harflerden birini yazin");
        char harf=scan.next().toUpperCase().charAt(0);

        switch (harf){
            case ('S'):
                System.out.println("Software");
                break;
            case('D'):
                System.out.println("Developer");
                break;
            case ('E'):
                System.out.println("Engineer");
                break;
            case ('T'):
                System.out.println("in Test");
            default:
                System.out.println("Lutfen gecerli bir harf girin");
        }
    }
}
