package For_Loops_Nested_For_Loops;

public class C09_nested_For_Loop {
    public static void main(String[] args) {
        /*
                Verilen satir sayisina gore
                asagidaki sekli olusturan kod yaziniz
                *
                * *
                * * *
                * * * *
         */
        int satir=4;
        for (int i =1; i <=satir ; i++) {// satirlar Outer Loop / dis Dongu
            for (int j = 1; j <=i ; j++) {// sutunlar inner Loop / ic dongu
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
