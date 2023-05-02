package practice1;

public class practice5 {
    public static void main(String[] args) {
        //Verilen String bir array'deki en uzun ve en kisa
        //kelimeleri yazdiran bir method olusturun

        String[]arr1={"Melike","Burkay","inci","Eda","Emre"};
        enUzunVeEnKisaYazdir(arr1);

    }
    public static void enUzunVeEnKisaYazdir(String[]arr){
        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }
        }
        System.out.println(enUzunKelime);
        System.out.println(enKisaKelime);
    }
}
