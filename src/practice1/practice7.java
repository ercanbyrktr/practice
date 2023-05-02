package practice1;

import java.util.Arrays;

public class practice7 {
    public static void main(String[] args) {
        //Verilen array'e istenen elementi ekleyelim
        /*
        int[] a={4,5,6};
        int[] b={4,5,6,10};
        a = b;
        System.out.println(Arrays.toString(a));
        Array'in uzunlugu degistirilmez
        Ancak array'e yeni bir array degeri atanabilir
         */

        int[] arr={4,5,6};
        int eklenecekElement=10;


        int[]yeniArr=new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekElement;
        System.out.println(Arrays.toString(yeniArr));

        arr=yeniArr;
        System.out.println(Arrays.toString(arr));
    }
}
