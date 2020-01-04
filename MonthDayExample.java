package javadatetime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample 
{

	public static void main(String[] args) 
	{
		MonthDay month=MonthDay.now();                              // current Date and month
		LocalDate date=month.atYear(2019);                         // check the month in 2019
		System.out.println(date);
		boolean a=month.isValidYear(2018);                       // check the month is present in the year 2018
		System.out.println(a);
		long b=month.get(ChronoField.MONTH_OF_YEAR);            
		System.out.println(b);
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR); // print given range of month
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH); // print the range of days in given month
		System.out.println(r2);
		
		
	}

}
