import java.time.*;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		//LocalDate date1=LocalDate.ofYearDay(2019, 365);
		//System.out.println(date1);
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getEra());
		
		LocalDate date1=LocalDate.of(2000, 5, 5);
		LocalDate cdate=LocalDate.now();
		Period age=Period.between(date1, cdate);
		System.out.println(age.getYears()+" "+age.getMonths()+" "+age.getDays());;
	}

}
