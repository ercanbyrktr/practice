package practice1;

public class practice4 {
    public static void main(String[] args) {
        //Verilen bir arrayde istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun

        int[] arr1 = {2, 7, 4, 5, 2, 6, 4, 7, 3, 5, 7};
        istenenElemaniYazdir(arr1,7);
    }
    public static void istenenElemaniYazdir(int[]arr,int arananElement){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==arananElement)
                sayac++;
        }
        System.out.println(sayac);
    }
}