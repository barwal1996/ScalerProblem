import java.text.SimpleDateFormat;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
public class test2 {
    static String sDate2="12-10-2021";

    public static void main(String[] args) throws IOException,ParseException{
        String sDate1=sDate2;
        for(int i=0;i<3;i++){

        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date1);
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));

         if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
        c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            System.out.println("WEEKEND PRICE");
            c1.add(Calendar.DAY_OF_MONTH, -1);
            sDate1=sdf.format(c1.getTime());
            i--;
            }
            else {
        System.out.println("WEEKDAY");
        c1.add(Calendar.DAY_OF_MONTH, -1);
        sDate1=sdf.format(c1.getTime());
        System.out.println("Date in loop "+sDate1);     
    }
}
    System.out.println("final date "+sDate1);
    }
}
