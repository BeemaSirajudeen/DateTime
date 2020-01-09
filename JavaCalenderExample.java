package javadateclassical;
import java.util.Calendar;
public class JavaCalenderExample
{

	public static void main(String[] args) 
	{
		Calendar calendar=Calendar.getInstance();//Gets a calendar using the default time zone and locale
		System.out.println("The current date is : " + calendar.getTime());
		calendar.add(Calendar.DATE, -15);//Adds the specified amount of time to the given calendar field
		System.out.println("15 days ago: " + calendar.getTime()); 
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4 months later: " + calendar.getTime()); 
		calendar.add(Calendar.YEAR, 2);
		System.out.println("2 years later: " + calendar.getTime()); 
		System.out.println("At present Calendar's Year: "+ calendar.get(Calendar.YEAR));
		System.out.println("At present Calendar's Day: "+ calendar.get(Calendar.DATE));
		System.out.println("At present Date and Time is: "+ calendar.getTime());
		int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);//Returns the maximum value for the given calendar field of this Calendar instance
		System.out.println("Maximum number of days in week : "+ maximum);
		maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of week in year : "+ maximum);
		int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in week : "+ minimum);//Returns the minimum value for the given calendar field of this Calendar instance
		minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of week in year : "+ minimum);
		
		
		
	}

}
