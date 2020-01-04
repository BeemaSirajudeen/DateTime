package javadatetime;
import java.time.Clock;
import java.time.Duration;

public class JavaClockExample
{

	public static void main(String[] args) 
	{
		Clock c1=Clock.systemDefaultZone();    // system current time zone
		System.out.println(c1.getZone());
		Clock c2=Clock.systemUTC();          // universal time coordinator (UTC). // universal time zone
		System.out.println(c2.instant());   // Base on UK time
		Duration d=Duration.ofHours(5);
		Clock clock=Clock.offset(c2, d);  // offset is adding 5 plus with UTC
		System.out.println(clock.instant());

	}

}
