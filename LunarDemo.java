package CalendarCode;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

public class LunarDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		LunarCalendar lundarCalendar = new LunarCalendar(calendar);
		lundarCalendar.todayCalendar();
		System.out.print("请输入你想查看的月份(88全部查看):");
		Scanner scanner =new Scanner(System.in);
		while(true) {
			int month = scanner.nextInt();
			if ((month >= 1)&&(month <= 12)) {
				calendar.set(Calendar.MONTH, month-1);
				System.out.println("\n\t\t\t"+month+"月\n");
				lundarCalendar.currentMonth(calendar);
			}else if(month == 88) {
				calendar.set(Calendar.MONTH, 0);
				for(int i = 1;i <= 12;i++) {
					System.out.println("\n\t\t\t"+i+"月\n");
					lundarCalendar.currentMonth(calendar);
				}
			}else {
				System.out.println("error!");
			}
		}
	}
}