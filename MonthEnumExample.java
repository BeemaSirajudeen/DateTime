package javadatetime;
import java.time.*;
import java.time.temporal.*;
public class MonthEnumExample 
{

	public static void main(String[] args) 
	{
		Month month=Month.valueOf("January".toUpperCase());//Returns the enum constant of this type with the specified name
		System.out.printf("For the month of%s all Sunday are:%n",month);
		LocalDate localdate=Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		Month mi=localdate.getMonth();
		while(mi==month)
		{
			System.out.println("%s%n,localdate");
			localdate =localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));//Returns an adjusted copy of this date.
			mi=localdate.getMonth();//Gets the month-of-year field using the Month enum. 
			
		}
		Month month1=Month.from(LocalDate.now());//Obtains the current date from the system clock in the default time-zone
		System.out.println(month1.getValue());
		System.out.println(month1.name());
		System.out.println(month1.minus(2));
		System.out.println(month1.plus(2));
		System.out.println("Total Number of days: "+month1.length(true));
		
		
		

	}

}
