package Team8;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Scanner scan=new Scanner(System.in);
        System.out.println("Müsteri kartiniz var mi : ");
        char cevap= scan.next().toUpperCase().charAt(0);
        System.out.println("ürün adedinizi giriniz : ");
        int urun= scan.nextInt();
        System.out.println("ürün fiyatini giriniz : ");
        double fiyat= scan.nextDouble();

        if (cevap =='E'){
            if (urun>10){
                System.out.println("İndirimli urun fiyati : "+(fiyat*0.80));
            }else {
                System.out.println("İndirimli urun fiyati : "+(fiyat*0.85));
            }

        } else if (cevap=='H') {
            if(urun>10){
                System.out.println("İndirimli urun fiyati : "+(fiyat*0.85));
            }else{
                System.out.println("İndirimli urun fiyati : "+(fiyat*0.90));
            }


        }
    }
}
