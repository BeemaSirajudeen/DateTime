package javadatetime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
public class JavaZoneIdExample 
{

	public static void main(String[] args) 
	{
		ZoneId zoneid1=ZoneId.of("Asia/Kolkata"); //get the value of id from given time zone
		ZoneId zoneid2=ZoneId.of("Asia/Tokyo");
		LocalTime id1=LocalTime.now(zoneid1);
		LocalTime id2=LocalTime.now(zoneid2); // get the time of the given time zone
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id1.isBefore(id2)); // check the id1 comes before id2
		ZoneId zone=ZoneId.systemDefault(); // object for system time zone
		System.out.println(zone);
		String s=zone.getId();
		System.out.println(s);
		System.out.println(zone.getDisplayName(TextStyle.FULL,Locale.ROOT));// return the value of india time
	}

}
