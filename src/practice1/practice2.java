package practice1;

import java.util.Arrays;


public class practice2 {
    public static void main(String[] args) {
        //Verilen bir int array'in tum elemanlarini 2 arttirip bize donduren bir method olusturun
        //Eski array'i yeni haliyle kaydedin

        int[] arr={3,4,5,6};
        arr=arrayElementleriniArtir(arr,2);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayElementleriniArtir (int[] ilkArr,int artis){
        for (int i = 0; i <ilkArr.length ; i++) {
            ilkArr[i]+=artis;
        }
        return ilkArr;
    }
}
