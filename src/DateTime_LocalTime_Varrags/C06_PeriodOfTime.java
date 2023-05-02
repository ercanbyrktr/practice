package DateTime_LocalTime_Varrags;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {
        LocalDate dogumTarihi= LocalDate.of(1987,12,8);
        LocalDate bugun=LocalDate.now();
        System.out.println(Period.between(dogumTarihi,bugun));
        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getYears());

    }
}
