package practice3_Arrays_MDA;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        //verilen bir arrayde istenen elemanın olup olmadigini bulur

        int[] arr={4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr,5));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,5));

    }
}
