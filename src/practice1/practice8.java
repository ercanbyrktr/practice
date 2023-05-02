package practice1;

import java.util.Arrays;

public class practice8 {
    public static void main(String[] args) {
        // verilen bir array'e istenen bir elementi ekleyip,
        // yeni halini bize donduren bir method olusturun
        int[] arr = {2,4,7,8};
        // arr'ye method'u kullanarak 5 ekleyin
        arr=arrayeElementEkleme(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayeElementEkleme(int arr[],int eklenecekEleman){
        int[]yeniArr=new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;
        return yeniArr;
    }
}
