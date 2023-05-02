package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        int[] fiyatlar={15,25,30,10,50};

        for (int i = 0; i < fiyatlar.length ; i++) {
            fiyatlar[i]+=3;
        }
        System.out.println(Arrays.toString(fiyatlar));
    }
}
