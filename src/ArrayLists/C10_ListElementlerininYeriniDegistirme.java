package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);

        System.out.println(sayilar);

        int temp= sayilar.get(2);

        //2.indexe 5.indexdeki degeri atayalım
        sayilar.set(2, sayilar.get(5));

        //5.indexe tempdeki degeri ata
        sayilar.set(5,temp);

        System.out.println(sayilar);
    }
}
