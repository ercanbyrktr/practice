package practice1;

public class practice3 {
    public static void main(String[] args) {
        /*
        Java Overloading kuralları
    1-ayni isim ve parametreleri ayni olan birden fazla method olusturulamaz
    2-Data turleri farkli olan parametrelerin yerlerini degistirirsek
    java yeni bir method olarak kabul eder.(int,double)

    overloading olan calsslarda java hangi methodun calıstırılacagına su sekilde karar verir.
    1-Cagırılan isimde method var mi?
    2-method call'da kullanilan arguments() ile methodlardaki parametrelerin %100 uyumlu oldugu var mi?
    3-Argument ile parametre ayni olmasa bile verilen argumentleri kabul edecek parametre var mi?
    4-Casting ile birden fazla methodu kullanabiliyorsa daha az casting ile calıiacak methodu kullanir.
         */
        topla(3,5);
        topla(3.4,2.3);
        topla(2,3.5);
        topla(3.4,2);
    }
    public static void topla(int a,int b){
        System.out.println("iki sayinin toplami : " + (a+b));

    }
    public static void topla(double a,double b){
        System.out.println("iki double sayinin toplami : "+ (a+b));
    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("int ve double sayilarinin toplami : "+ (sayi1+sayi2));
    }
    public static void topla(double sayi1,int sayi2){
        System.out.println("double ve int sayilarin toplami : "+ (sayi1+sayi2));
    }
}
