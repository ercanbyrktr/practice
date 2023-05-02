package A.hazirlik;

public class StringTersCevirme {
    public static void main(String[] args) {
        String input="Java beyin yakar!";

        String output="";

        for (int i =input.length()-1; i >=0 ; i--) {
            output+=input.charAt(i);
        }
        System.out.println(output);
    }
}
