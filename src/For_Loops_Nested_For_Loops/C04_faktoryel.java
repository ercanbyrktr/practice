package For_Loops_Nested_For_Loops;

public class C04_faktoryel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.
        int sayi=10;
        int faktoryel=1;
        for (int i =sayi; i >=1 ; i--) {
            faktoryel*=i;
        }
        System.out.println(sayi + "! = " + faktoryel);
    }
}
