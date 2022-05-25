import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		
		List<Student>list=new ArrayList<>();
		list.add(new Student("Kowlutla",20));
		list.add(new Student("Hindi",6));
		list.add(new Student("Roopa",8));
		list.add(new Student("Deekshi",1));
		list.add(new Student("Deepu",20));
		list.add(new Student("Hari",25));
		list.add(new Student("Keshav",50));
		list.forEach(System.out::println);
		System.out.println();
		list=list.stream()
				.sorted(Comparator.comparing(Student::getAge)
				.reversed().
				thenComparing(Student::getName,Collections.reverseOrder()))
				.collect(Collectors.toList());
		list.forEach(System.out::println);
		
		System.out.println();
		
		list=list.stream()
				.filter(s->s.getAge()>10).collect(Collectors.toList());
		list.forEach(System.out::println);
		
		
		Integer array[]=new Integer[10];
		
		Arrays.fill(array, 1);
		int temp=Arrays.asList(array).
				stream().
				reduce(0,(a,b)->a+b);
		System.out.println(temp);
	}
}

class Student
{
	String name;
	int age;
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return name+"  "+age;
	}
}
