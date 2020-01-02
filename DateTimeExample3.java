package javadatetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeExample3 {

	public static void main(String[] args) {
		             //ISO Date
		LocalDate localDate=LocalDate.now();
		DateTimeFormatter dateFormatter=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localDate.format(dateFormatter));
		
		             //YYYY/MM/DD Pattern
		DateTimeFormatter dateFormatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(localDate.format(dateFormatter1));
		
		            //  MMMM DD,YYYY Pattern
				DateTimeFormatter dateFormatter2=DateTimeFormatter.ofPattern("MMMM dd,yyyy");
				System.out.println(localDate.format(dateFormatter2));
				
		           //DD-MMM-YYYY Pattern
				DateTimeFormatter dateFormatter3=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
				System.out.println(localDate.format(dateFormatter3));

				//DD-LL-YYYY Pattern
			   
				DateTimeFormatter dateFormatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
				System.out.println(localDate.format(dateFormatter4));

	}

}
