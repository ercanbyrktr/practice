package For_Loops_Nested_For_Loops;

public class C08_nested_ForLoop {
    public static void main(String[] args) {
        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun
        /*
         * * * * *
         * * * * *
         * * * * *
         */
        int satir=4;
        int sutun=4;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
