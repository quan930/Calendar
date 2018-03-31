package CalendarCode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar birth = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar now = Calendar.getInstance();
		System.out.print("出生日期(yyyy-MM-dd):");
		Date birthDate = null;
		try {
			birthDate = dateFormat.parse(new Scanner(System.in).nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		birth.setTime(birthDate);
		System.out.println(yearsBetween(birth,now)+"岁");
		System.out.println("你活了"+daysBetween(birth,now)+"天");
			
	}
	public static long yearsBetween(Calendar begin,Calendar end) {
		Calendar calendar = (Calendar)begin.clone();
		long year = 0;
		while(calendar.before(end)) {
			calendar.add(Calendar.YEAR, 1);
			year++;
		}
		return year-1;
	}
	public static long daysBetween(Calendar begin,Calendar end) {
		Calendar calendar = (Calendar)begin.clone();
		long days = 0;
		while(calendar.before(end)) {
			calendar.add(Calendar.DATE, 1);
			days++;
		}
		return days-1;
	}
}
