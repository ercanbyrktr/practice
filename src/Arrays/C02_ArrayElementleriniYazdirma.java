package Arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniYazdirma {
    public static void main(String[] args) {

        int[]arr={3,5,6,7,8,1,2};//[3, 5, 6, 7, 8, 1, 2]

        //Tum array'i yazdirin

        System.out.println(Arrays.toString(arr));

        //array'in tum elementlerini yan yana aralarında bosluk olarak yazdırın

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
