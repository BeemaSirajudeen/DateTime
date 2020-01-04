package javadatetime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
public class JavaOffsetDateTimeExample 
{

	public static void main(String[] args) 
	{
		OffsetDateTime offsetDT=OffsetDateTime.now(); // current date and time
		System.out.println(offsetDT.getDayOfMonth()); // return current day on month
		System.out.println(offsetDT.getDayOfYear());  // return current day on year
		System.out.println(offsetDT.getDayOfWeek()); // return current day on week
		System.out.println(offsetDT.toLocalDate());   // current date,moth,year
		OffsetDateTime value1=offsetDT.minusDays(240); // Subtract values from current days
		System.out.println(value1);
		OffsetDateTime value2=offsetDT.plusDays(240); // adding values to current days
		System.out.println(value2);
		
		
		
		

	}

}
