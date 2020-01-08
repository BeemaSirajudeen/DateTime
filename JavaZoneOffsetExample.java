package javadatetime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
public class JavaZoneOffsetExample 
{

	public static void main(String[] args) 
	{
		ZoneOffset zone1=ZoneOffset.UTC;//The time-zone offset for UTC, with an ID of 'Z'
		Temporal temp=zone1.adjustInto(ZonedDateTime.now());
		System.out.println(temp);
		ZoneOffset zone2=ZoneOffset.ofHours(5);//A time-zone offset is the amount of time that a time-zone differs from Greenwich/
		System.out.println(zone2);
		ZoneOffset zone3=ZoneOffset.ofHoursMinutes(5,30);
		System.out.println(zone3);
		boolean b1=zone1.isSupported(ChronoField.OFFSET_SECONDS);//offset in seconds of local time from UTC/Greenwich
		System.out.println(b1);
		boolean b2=zone1.isSupported(ChronoField.SECOND_OF_MINUTE);
		System.out.println(b2);
		
		
		

	}

}
