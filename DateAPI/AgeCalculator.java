import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Scanner;
import java.util.*;

public class AgeCalculator {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date of birth(YYYY-MM-DD): ");
		String s=sc.nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/DD");
		Date d=sdf.parse(s);
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		LocalDate dob=LocalDate.of(year, month, day);
		LocalDate now=LocalDate.now();
		Period p=Period.between(dob, now);
		System.out.println(p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);

	}

}
