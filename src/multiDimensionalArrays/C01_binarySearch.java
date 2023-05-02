package multiDimensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        //verilen bir arrayde istenen elemanın olup olmadigini bulur

        int[] arr={4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr,5));//-2
        System.out.println(Arrays.binarySearch(arr,11));//4
        System.out.println(Arrays.binarySearch(arr,1));//-1
        System.out.println(Arrays.binarySearch(arr,7));//-2

        //Array'de binarySearch()'un düzgün calismasi icin
        //oncelikle sort() calistirilmalidir

        Arrays.sort(arr);//[1,3,4,4,5,6,7,9,11]
        System.out.println(Arrays.binarySearch(arr,5));//4
        System.out.println(Arrays.binarySearch(arr,11));//8
        System.out.println(Arrays.binarySearch(arr,1));//0
        System.out.println(Arrays.binarySearch(arr,7));//6

        // binarySearch() aranan elementin index'ini doner

        System.out.println(Arrays.binarySearch(arr,8));//-8
        System.out.println(Arrays.binarySearch(arr,2));//-2
        System.out.println(Arrays.binarySearch(arr,10));//-9
        System.out.println(Arrays.binarySearch(arr,13));//-10
        System.out.println(Arrays.binarySearch(arr,20));//-10

        //olmayan bir element aratilirsa, once array'de olsaydi nerede olurdu bunu buluyoruz
        //olması gereken sıranın - işaretli degerini verir

    }
}
