package A.hazirlik;

public class ArraydeIstenenElemaniBulma {
    public static void main(String[] args) {
        //Verilen bir arrayde istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun

        //int[] arr1 = {2, 4, 5, 2, 6, 4, 7, 3, 5};
       // elemanSayisiYazdir(arr1,7);
        String[]arr2={"A","B","C","D","A"};
        elemanSayisiYazdir(arr2,"A");
    }
    public static void elemanSayisiYazdir(int[]arr,int arananSayi){
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananSayi){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
    public static void elemanSayisiYazdir(String[]arr,String arananSayi){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(arananSayi)){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
