package A.hazirlik;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciDizisi {
    public static void main(String[] args) {
        // Kullanıcadan alınanan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        // (input=6    output=1-1-2-3-5-8)
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi girin");
        int sayi= scan.nextInt();

        fibonacci(sayi);
    }

    private static void fibonacci(int sayi) {
        ArrayList<Integer>fibo=new ArrayList<>();
        fibo.add(1);
        fibo.add(1);

        for (int i = 2; i <sayi ; i++) {
            fibo.add(fibo.get(i-2)+ fibo.get(i-1));
        }
        System.out.println(fibo);
    }
}
