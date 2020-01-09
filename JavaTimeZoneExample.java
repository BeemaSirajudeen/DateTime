package javadateclassical;
import java.util.Calendar;
import java.util.TimeZone;
public class JavaTimeZoneExample 
{

	public static void main(String[] args) 
	{
		String[] id=TimeZone.getAvailableIDs(); // return an array of IDs.
		System.out.println("In TimeZone class available Ids are : ");
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");//Gets the TimeZone for the given ID.
		System.out.println("The offset value of TimeZone: "+zone.getOffset(Calendar.ZONE_OFFSET));
		System.out.println("Value of ID is:"+zone.getID());
		TimeZone zone1=TimeZone.getDefault();//Gets the default TimeZone of the Java virtual machine
		String name=zone1.getDisplayName();//Returns a long standard time name of this TimeZone suitable for presentation to the user in the default locale. 
		System.out.println("Display name for default time zone: "+name);
		
	}

}
