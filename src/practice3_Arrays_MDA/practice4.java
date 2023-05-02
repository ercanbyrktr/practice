package practice3_Arrays_MDA;

import java.util.Arrays;

public class practice4 {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 7}, {1, 2, 3, 4}, {1, 2}, {7}};
        // array'de kac tane cift sayi oldugunu bulun

       int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    sayac++;
                }
            }
        }
        System.out.println(sayac);
    }
}
