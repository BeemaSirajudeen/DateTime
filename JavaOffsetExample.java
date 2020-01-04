package javadatetime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class JavaOffsetExample
{

	public static void main(String[] args) 
	{
		OffsetTime offset=OffsetTime.now();                 // current time
		int h=offset.get(ChronoField.HOUR_OF_DAY);         // it shows hour of a day that starts from 12'o clock from morning
		System.out.println(h);
		int m=offset.get(ChronoField.MINUTE_OF_DAY);     //it shows minutes of a day that starts from 12'o clock from morning
		System.out.println(m);
		int s=offset.get(ChronoField.SECOND_OF_DAY);   //second starts from 12'o clock
		System.out.println(s);
		int h1=offset.getHour();                     // current hour
		System.out.println(h1+" hour ");            
		int m1=offset.getMinute();                 // current minute
		System.out.println(m1+" minute ");       
		int s1=offset.getSecond();               // current second
		System.out.println(s1+" second ");      
	}

}
