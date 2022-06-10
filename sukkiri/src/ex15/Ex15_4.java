package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex15_4 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		System.out.println(c.getTime());
		Date d = c.getTime();
		
		
		SimpleDateFormat f = new SimpleDateFormat("西暦 yyyy年MM月dd日");
		System.out.println(f.format(d));
	}
}
