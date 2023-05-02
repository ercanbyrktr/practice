package practice1;

import java.util.Arrays;

public class practice6 {
    public static void main(String[] args) {

        int[] arr={4,5,6,7};
        int temp=arr[arr.length-1];

        for (int i = 0; i <arr.length-1 ; i++) {
            arr[arr.length-1-i]=arr[arr.length-2-i];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
