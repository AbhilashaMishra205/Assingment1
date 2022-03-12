import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Find_Next_Date
{
private static final long ONE_DAY_MILLI_SECONDS = 24 * 60 * 60 * 1000;

	// date format
	private static final String DATE_FORMAT = "dd/MM/yyyy";

public static void main(String[] args)throws ParseException
    {
 Scanner ref1=new Scanner(System.in); 
System.out.print("enter day: ");
        int day=ref1.nextInt();

System.out.print("enter Month : ");
     
        int month=ref1.nextInt();
System.out.print("enter year : ");
      
        int year=ref1.nextInt();
StringBuilder sb = new StringBuilder();
sb.append(day).append("/").append(month).append("/").append(year);
String mystring=sb.toString();
//System.out.println(mystring);

SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		Date date = dateFormat.parse(mystring);
long nextDayMilliSeconds = date.getTime() + ONE_DAY_MILLI_SECONDS;
		Date nextDate = new Date(nextDayMilliSeconds);
		String nextDateStr = dateFormat.format(nextDate);
System.out.println("Given Date : " + mystring);
		System.out.println("Next Date : " + nextDateStr);


}}