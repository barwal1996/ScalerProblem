
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class test1 {
    

Date date=new Date();
/*public static Date slaDueDate(date Date){
switch(variance%7){
case 0: date.minusDay(3)
case 1:date.minusDay(3)
case 2:date.minusDay(3)
case 3:date.minusDay(3)
case 4:date.minusDay(3)
case 5:date.minusDay(3)
case 6://sunday
}
} */
public static void main(String[] args) {
Date date=new Date();
Calendar c = Calendar.getInstance();
c.setTime(date);
int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
System.out.println("Day of week in number:"+dayOfWeek);
String dayWeekText = new SimpleDateFormat("EEEE").format(date);
System.out.println("Day of week in text:"+dayWeekText);
}
}
