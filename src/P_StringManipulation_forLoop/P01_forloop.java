package P_StringManipulation_forLoop;

import java.util.Scanner;

public class P01_forloop {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangıc ve bitis degeri olan 2 pozitif sayi giriniz : ");
        int bas= scan.nextInt();
        int bit= scan.nextInt();
        int sayitop=0;



          if (bas>bit){
              System.out.println("Bitis degeri baslangic degerinden kücüktür.");
          }else{
              for (int i = bas; i <=bit ; i++) {
              sayitop +=i ;

          }
              System.out.println("Sayilarin toplami : "+sayitop);
        }

    }
}
