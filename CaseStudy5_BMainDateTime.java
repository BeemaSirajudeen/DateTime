package javadatetime;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;
public class CaseStudy5_BMainDateTime 
{
   static Scanner ob = new Scanner(System.in);
   public static void main(String [] arg)
   {
     int id;
     String name,address,mob,pt,pno,ac,cot,cable,wifi,laundry;
     int op2,date=0;
     int r=0,b=0,rid=1001,bid=2001,roomid=201;
     int d1,d2;
     Date date1;
     String dates;
     CaseStudy5_RegisterDateTime re[]=new  CaseStudy5_RegisterDateTime [20];
     CaseStudy5RB_DateTime  bo[]=new CaseStudy5RB_DateTime [20];
     String op;
     do
       {
         System.out.println("Select your Needs\n1.Booking\n2.View Booking\n3.Exit\n---->");
         op2 = ob.nextInt();
         switch(op2)
         {
           case 1:
           System.out.println("Registration \n");
           System.out.println("Enter personal details");
           System.out.println("->Enter Name : ");
           ob.nextLine();
           name=ob.nextLine();
           System.out.println("->Enter Address : ");
           address=ob.nextLine();
           System.out.println("->Enter Mobile Number : ");
           mob=ob.nextLine();
           System.out.println("->Enter ID-Proof Type : ");
           pt=ob.nextLine();
           System.out.println("->Enter ID-Proof Number : ");
           pno=ob.nextLine();
           re[r]=new CaseStudy5_RegisterDateTime ();
           int reid=re[r].registration(rid,name,address,mob,pt,pno);
           rid++;
           re[r].display();

           do
            {
              System.out.println("Please choose the services required\n.AC/non-AC (Enter AC/nAC) :");
              ac=ob.next();
              System.out.println(".Cot(Enter Single/Double) :");
              cot=ob.next();
              System.out.println(".With cable connection/without cable connection(Enter C/nC) :");
              cable=ob.next();
              System.out.println(".Wi-Fi needed or not(Enter W/nW) :");
              wifi=ob.next();
              System.out.println(".Laundry service needed or not(Enter L/nL) :");
              laundry=ob.next();
              System.out.println(".Enter Booking date(dd-mm-yyyy):");
              dates=ob.next();
              DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("dd-LL-yyyy");
              LocalDate date2=LocalDate.parse(dates,dateFormatter);
              bo[b]=new CaseStudy5RB_DateTime ();
              int bbid=bo[b].book(ac, cot, cable, wifi, laundry,date2,roomid,reid);
              b++;
              roomid++;
              System.out.println("Do you want to Book more Rooms(Yes/No):");
              op=ob.next();
            }
                while(op.equals("yes")||op.equals("Yes")||op.contentEquals("YES"));
                break;
                case 2:
                System.out.println("Enter Start Date:");
                String s=ob.next();
                DateTimeFormatter dateFormatter1=DateTimeFormatter.ofPattern("dd-LL-yyyy");
                LocalDate sdate=LocalDate.parse(s,dateFormatter1);
                System.out.println("Enter End Date:");
                String s1=ob.next();
                DateTimeFormatter dateFormatter2=DateTimeFormatter.ofPattern("dd-LL-yyyy");
                LocalDate epdate=LocalDate.parse(s1,dateFormatter2);
                System.out.println("                BOOKING DETAILS\n-----------------------------");
                System.out.println("Room Number\tBooking Date\tCustomer id");

                for(int j=0;j<b;j++)
                 {
                   if((bo[j].date2.isAfter(sdate))&&(bo[j].date2.isBefore(epdate)))
                    {
                      bo[j].view(sdate,epdate);
                    }
                 }
                 break;
                 case 3:
                 System.exit(0);
           }
                 System.out.println("Do you want to proceed?(yes/no)");
                 op=ob.next();
                 }
                 while(op.contentEquals("yes")||op.contentEquals("YES")||op.contentEquals("Yes"));
       }
 }

