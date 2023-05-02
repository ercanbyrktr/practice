package Arrays;

import java.util.Arrays;

public class C11_sort_BinarySearch {
    public static void main(String[] args) {
        // Verilen bir array'i natural order'a gore siralamak icin
        // Arrays.sort() kullanilir
        int[] arr1= {3,9,6,1,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2={"Hasan","Huseyin","Mehmet","Mesut","Mercan","ali"};
        //{"Hasan","Huseyin","Mehmet","Mesut","Mercan","ali"}

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //sort yapıldıktan sonra
        //arrayde bir elementin var oldugunu kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr2,"ali"));
    }
}
