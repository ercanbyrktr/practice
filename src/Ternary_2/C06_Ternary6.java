package Ternary_2;

public class C06_Ternary6 {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
        //yazdirin
        //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        //uygun olani yazdirin
        int sayi=20;
        System.out.println(sayi>0 ? sayi%2==0 ? "cift sayi":"Tek sayi"
        :sayi>-1000&&sayi<-99?"sayi 3 basamakli":"sayi 3 basamakli degil");
    }
}
