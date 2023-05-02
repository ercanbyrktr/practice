package Do_WhileLoop;

public class P2_soru {
    public static void main(String[] args) {
        //Soru 2 )
        //’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yzdırın

        char harf='m';

        do{
            harf--;
            System.out.print(harf +" ");
        }while(harf>'c');


    }
}
