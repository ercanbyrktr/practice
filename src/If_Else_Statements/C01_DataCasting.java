package If_Else_Statements;

public class C01_DataCasting {
    public static void main(String[] args) {
        //Java'da bazı data türleri asla başka data türlerine çevrilemez

        //ozellikle sayisal data türündeki degerler
        //baska sayisal data türündeki variable'lara atanabilir

        double db1=23;
        short sh1=12;

        int sayi2=sh1;
        //daha dar data türündeki degeri daha genis data türündeki variable'a atamaya
        //autowidening denir ve java bunu otomatik yapar

        sh1=(short) sayi2;
        sayi2=(int)db1;
        //daha genis data turundeki degeri daha dar data turundeki variable'a atamaya
        //explicit narrowing denir ve java bunu otomatik yapmaz
        //bizden onay ister

        sayi2='k';

        if (sayi2>'d'){

        }
        //char data türündeki degerler, sayisal islemlerde kullanılabilir
        //bir char matematiksel islemde kullanılırsa ASCII Table'daki degeri ile isleme girer

        System.out.println('k'+1);//108
        //eger bu islemin char olarak degerini yazdırmak istersek
        //sayisal degerler char'a cast edilebilir

        System.out.println((char) ('k'+1));//l

    }
}
