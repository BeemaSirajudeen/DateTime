package javadatetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.*;
import java.time.Year;
import java.time.Period;
import java.time.YearMonth;
public class JavaYearExample 
{

	public static void main(String[] args) 
	{
		Year y1=Year.now(); // current year
		System.out.println(y1);
		Year y2=Year.of(2020);
		LocalDate l=y2.atDay(100); // current local date
		System.out.println(1);
		System.out.println(y2.length()); // length of the year
		System.out.println(y2.isLeap());   // leap year or not
		YearMonth ym=YearMonth.now();    // current year and month
		System.out.println(ym);
		String s=ym.format(DateTimeFormatter.ofPattern("MM yyyy")); //return month and year
		System.out.println(s);
		long l1=ym.getLong(ChronoField.YEAR);
		System.out.println(l1);
		long l2=ym.getLong(ChronoField.MONTH_OF_YEAR);
		System.out.println(l2);
		YearMonth ym2=ym.plus(Period.ofYears(2));// adding plus 2 to the  current year
		System.out.println(ym2);
		YearMonth ym3=ym.minus(Period.ofYears(2));// subtract 2 from the  current year 
		System.out.println(ym3);
		
		

	}

}
