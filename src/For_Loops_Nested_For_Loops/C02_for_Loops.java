package For_Loops_Nested_For_Loops;

public class C02_for_Loops {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        int baslangic = 3;
        int bitis =5;
        int toplam = 0;
        if (bitis<baslangic) {
            System.out.print("yanlis rakam girdiniz");
        } else {
            for (int i =baslangic; i <= bitis; i++) {
                toplam+=i;
            }
        }
        System.out.println("sayilarin toplami : "+toplam);
    }
}
