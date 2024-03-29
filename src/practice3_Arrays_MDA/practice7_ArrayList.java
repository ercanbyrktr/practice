package practice3_Arrays_MDA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice7_ArrayList {
    public static void main(String[] args) {
        //verilen bir array'den tekrar eden sayilari silip
        //her bir elemntin sadece bir kez kullanildigi bir hale donusturun

        int[] arr={3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        //bir tane bos bir list olusturalım
        //array'deki her bir elemani ele alalim
        //ele aldigimiz element list'de yoksa ekleyelim, varsa eklemeyelim
        //boylece benzersiz elementlerden olusan bir list olusturalim

        List<Integer> benzersizElementlerList=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (!benzersizElementlerList.contains(arr[i])){
                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList);//[3, 4, 5, 6, 2, 7]
        //istenen listeyi list olarak elde ettik
        //bunu arr'ye direk atayamayiz

        arr=new int[benzersizElementlerList.size()];//[0,0,0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=benzersizElementlerList.get(i);
        }

        System.out.println(Arrays.toString(arr));//[3, 4, 5, 6, 2, 7]
    }
}
