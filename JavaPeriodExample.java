package javadatetime;
import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit;
public class JavaPeriodExample
{

	public static void main(String[] args) 
	{
		Period period1=Period.ofDays(24);//Obtains a Period representing a number of days. 
		Temporal temp=period1.addTo(LocalDate.now()); //period of days adding to current days
		System.out.println(temp);
		Period period2=Period.of(2020, 01, 03);  //Period representing a number of years, months and days
		System.out.println(period2.toString());
		Period period3=Period.ofMonths(4);
		Period period4=period3.minus(Period.ofMonths(2));
		System.out.println(period4);
		Period period5=period3.plus(Period.ofMonths(2));
		System.out.println(period5);
		Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);//Obtains a Duration representing the duration between two temporal objects. 
		System.out.println(d.get(ChronoUnit.SECONDS));
		Duration d1=Duration.between(LocalTime.MAX,LocalTime.NOON);
		System.out.println(d1.isNegative());
		Duration d2=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(d2.isNegative());
		System.out.println(d.getSeconds());
		Duration d3=d.minus(d);//Returns a copy of this duration with the specified duration subtracted
		System.out.println(d3.getSeconds());
		Duration d4=d.plus(d);//Returns a copy of this duration with the specified duration added
		System.out.println(d4.getSeconds());
		
		
		

	}

}
