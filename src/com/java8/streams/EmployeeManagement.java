/**
 * 
 */
package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author KowlutlaSwamy
 *
 */
public class EmployeeManagement {
	
	/**
	 * Query 3.1 : How many male and female employees are there in the organization?
	 */
	public static void maleFemaleCount(List<Employee> employeeList) {
		
		Map<String, Long> maleFemale = employeeList.stream()
		    .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maleFemale);
		
	}
	
	/**
	 * Query 3.2 : Print the name of all departments in the organization?
	 * 
	 * @param employees
	 */
	public static void allDepartments(List<Employee> employees) {
		
		employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.3 : What is the average age of male and female employees?
	 */
	public static void averageAgeOfMaleAndFemale(List<Employee> employees) {
		
		employees.stream()
		    .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)))
		    .entrySet()
		    .forEach(System.out::println);
		;
		
	}
	
	/**
	 * Query 3.4 : Get the details of highest paid employee in the organization?
	 */
	public static void highestPaidEmployee(List<Employee> employees) {
		
		employees.stream()
		    .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
		    .ifPresent(System.out::println);
		
	}
	
	/**
	 * Query 3.5 : Get the names of all employees who have joined after 2015?
	 */
	public static void joinedAfter2015(List<Employee> employees) {
		
		employees.stream().filter(e -> e.getYearOfJoining() > 2015).forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.6 : Count the number of employees in each department?
	 */
	public static void employeesCountInDepartment(List<Employee> employees) {
		
		employees.stream()
		    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
		    .entrySet()
		    .forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.7 : What is the average salary of each department?
	 */
	public static void averageSalaryOfEachDepartment(List<Employee> employees) {
		
		employees.stream()
		    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
		    .entrySet()
		    .forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.8 : Get the details of youngest male employee in the product
	 * development department?
	 */
	public static void youngestEmployeInProductDevelopment(List<Employee> employees) {
		
		employees.stream()
		    .filter(e -> "Product Development".equals(e.getDepartment()))
		    .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)))
		    .ifPresent(System.out::println);
		
	}
	
	/**
	 * Query 3.9 : Who has the most working experience in the organization?
	 */
	public static void mostWorkingExp(List<Employee> employees) {
		
		employees.stream()
		    .collect(Collectors.minBy((e1, e2) -> e1.getYearOfJoining() - e2.getYearOfJoining()))
		    .ifPresent(System.out::println);
		
		employees.stream()
		    .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)))
		    .ifPresent(System.out::println);
		
	}
	
	/**
	 * Query 3.10 : How many male and female employees are there in the sales and
	 * marketing team?
	 */
	public static void countOfMaleAndFemaleInSalesAndMarketing(List<Employee> employees) {
		
		employees.stream()
		    .filter(e -> ("Sales And Marketing".equals(e.getDepartment())))
		    .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
		    .entrySet()
		    .forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.11 : What is the average salary of male and female employees?
	 */
	public static void averageSalaryOfMaleAndFemale(List<Employee> employees) {
		
		employees.stream()
		    .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
		    .entrySet()
		    .forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.12 : List down the names of all employees in each department?
	 */
	public static void allEmployeeNamesInEachDept(List<Employee> employees) {
		
		employees.stream()
		    .collect(
		        Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())))
		    .entrySet()
		    .forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.13 : What is the average salary and total salary of the whole
	 * organization?
	 */
	public static void salaryStatatics(List<Employee> employees) {
		
		DoubleSummaryStatistics salarySummaryStatistics = employees.stream()
		    .collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Total Salary: " + salarySummaryStatistics.getSum());
		System.out.println("Average salary: " + salarySummaryStatistics.getAverage());
		System.out.println("Minimum Salary: " + salarySummaryStatistics.getMin());
		System.out.println("Maximum Salary: " + salarySummaryStatistics.getMax());
		
	}
	
	/**
	 * Query 3.14 : Separate the employees who are younger or equal to 25 years from
	 * those employees who are older than 25 years.
	 */
	public static void seperateEmployesByAge(List<Employee> employees) {
		
		Map<Boolean, List<Employee>> segregatedEmployees = employees.stream()
		    .collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
		System.out.println("Employees Younger than or equal to 25 years");
		segregatedEmployees.get(true).forEach(System.out::println);
		System.out.println("\nEmployees are older than 25 years");
		segregatedEmployees.get(false).forEach(System.out::println);
		
	}
	
	/**
	 * Query 3.15 : Who is the oldest employee in the organization? What is his age
	 * and which department he belongs to?
	 */
	public static void oldestEmployee(List<Employee> employees) {
		
		employees.stream()
		    .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)))
		    .ifPresent(e -> System.out.println(e.getName() + "\t" + e.getDepartment() + "\t" + e.getAge()));
		
	}
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		oldestEmployee(employeeList);
		
	}
	
}
