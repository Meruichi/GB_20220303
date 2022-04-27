package calendar;

import java.util.Calendar;

public class Main02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DatePrinter.printDateTime(cal);
		
		// 지금으로부터 100일 후
		cal.add(Calendar.DAY_OF_MONTH, 100);
		DatePrinter.printDateTime(cal);
		
		// 지금으로부터 75년전
		cal.add(Calendar.YEAR, -75);
		DatePrinter.printDateTime(cal);
		
		// 지금으로부터 9시간전
		cal.add(Calendar.HOUR, -9);
		DatePrinter.printDateTime(cal);
		
		// 지금으로부터 8달후
		cal.add(Calendar.MONTH, 8);
		DatePrinter.printDateTime(cal);
	}

}
