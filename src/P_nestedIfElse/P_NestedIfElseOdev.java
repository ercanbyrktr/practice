package P_nestedIfElse;

import java.util.Scanner;

public class P_NestedIfElseOdev {
    public static void main(String[] args) {
        //-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);


        System.out.println("Kayitli musteri misiniz : ");
        char mst = scan.next().charAt(0);
        System.out.println("Lutfen urun adedinizi giriniz : ");
        int urun = scan.nextInt();
        System.out.println("Lutfen fiyat bilgisi giriniz : ");
        double fiyat = scan.nextDouble();

        if (mst == 'e') {
            if (urun > 10) {
                System.out.println("indirimli tutar : " + (fiyat*0.80));

            }else {
                System.out.println("indirimli tutar : " + (fiyat * 0.90));
            }
        }else if(mst == 'h' ){
            if(urun > 10){
                  System.out.println("indirimli tutar : " + (fiyat * 0.85));

            } else{
                   System.out.println("indirimli tutar : " + (fiyat* 0.90));
                }}


            }}


