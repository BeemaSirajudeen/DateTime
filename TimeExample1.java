package javadatetime;
import java.time.LocalTime;
public class TimeExample1 {

	public static void main(String[] args) {
		// Current Time
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		//Specific Time
		LocalTime localTime2=LocalTime.of(4, 30,45);
		System.out.println(localTime2);
		System.out.println("Hour : "+ localTime.getHour());
		System.out.println("Minute : "+ localTime.getMinute());
		System.out.println("Second : "+ localTime.getSecond());
		
		//LocalTime's plus methods
		System.out.println("Addition of Hours : "+ localTime.plusHours(2));
		System.out.println("Addition of Minutes : "+ localTime.plusMinutes(30));
		System.out.println("Addition of Seconds : "+ localTime.plusSeconds(20));
		System.out.println("Addition of Nanos : "+ localTime.plusNanos(60000));

		
		//localTime minus methods
		System.out.println("Subtraction of Hours : "+ localTime.minusHours(2));
		System.out.println("Subtraction of Minutes : "+ localTime.minusMinutes(30));
		System.out.println("Subtraction of Seconds : "+ localTime.minusSeconds(20));
		System.out.println("Subtraction of Nanos : "+ localTime.minusNanos(60000));
		
		LocalTime localTime3=LocalTime.of(11, 45,20);
		
		//compareTo() example
		if(localTime.compareTo(localTime2)==0)
		{
			System.out.println("localTime1 and localTime2 are equal");
			
		}
		else
		{
			System.out.println("localTime1 and localTime2 are not equal");
			
		}
		
		//isBefore() example
		if(localTime2.isBefore(localTime3))
		{
			System.out.println("localTime2 comes before localTime3");
			
		}
		//isAfter() example
				if(localTime3.isAfter(localTime))
				{
					System.out.println("localTime3 comes after localTime1");
					
				}

		



	}

}
