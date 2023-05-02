package P_StringManipulation_forLoop;

public class P03_StringiTersCevirme {
    public static void main(String[] args) {
     /*
        Kullanicidan bir String isteyin ve String’i tersten yazdirin
        . Soru 10 (interview)-Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
      */
        String input="Java Candir";
        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {
            output +=input.charAt(i);


        }  System.out.println("Java Candir : "+output);

    }
}
