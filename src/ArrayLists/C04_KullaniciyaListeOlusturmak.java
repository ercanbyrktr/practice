package ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturmak {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(kullaniciyaListeOlusturtma());
    }

    public static List<String> kullaniciyaListeOlusturtma(){
        List<String>isimler=new ArrayList<>();
        String girilenisim="";
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Listeye eklemek icin isimler girin" +
                    "\nbitirmek icin q' ya basin : ");
            girilenisim = scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")) {
                isimler.add(girilenisim);
            }
            } while (!girilenisim.equalsIgnoreCase("q")) ;

        return isimler;

    }

}
