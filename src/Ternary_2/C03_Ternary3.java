package Ternary_2;

public class C03_Ternary3 {
    public static void main(String[] args) {
        char harf='m';

        System.out.println(harf>='a' && harf<'z'?
                Character.toUpperCase(harf):harf);
    }
}
