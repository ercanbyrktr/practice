package practice3_Arrays_MDA;

public class practice3 {
    public static void main(String[] args) {
        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};
        // toplam element sayisi kactir ?

        int elementSayisi=0;

        for (int i = 0; i <arr.length ; i++) {
            elementSayisi+=arr[i].length;
        }
        System.out.println(elementSayisi);

        int elementlerinToplami=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                elementlerinToplami+=arr[i][j];
            }
        }
        System.out.println(elementlerinToplami);

    }

}
