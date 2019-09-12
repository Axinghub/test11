import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.MONTH, 1);
        int firstDay=calendar.getActualMinimum(calendar.DAY_OF_MONTH);
        int lastDay=calendar.getActualMaximum(calendar.DAY_OF_MONTH);
        System.out.println(2+"月第一天是："+firstDay);
        System.out.println(2+"月最后一天是："+lastDay);
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(calendar.getTime()));

    }
}
