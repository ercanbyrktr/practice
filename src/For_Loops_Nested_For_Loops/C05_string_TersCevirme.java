package For_Loops_Nested_For_Loops;

public class C05_string_TersCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.
        String input="Java candir!";
        String output=" ";
        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
