import java.time.DayOfWeek;
import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        LocalDate date=null;
        int days=3;
        date=subtractDaysSkippingWeekends(date,days);
    }
    public static LocalDate subtractDaysSkippingWeekends(LocalDate date, int days) {
        LocalDate result = date;
        int subtractedDays = 0;
        while (subtractedDays < days) {
            result = result.minusDays(1);
            if (!(result.getDayOfWeek() == DayOfWeek.SATURDAY || result.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                ++subtractedDays;
            }
        }
        return result;
    }
}
