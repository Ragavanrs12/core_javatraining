package com.thirdware.file;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Employee {
@SuppressWarnings("rawtypes")
static ArrayList<EmployeeDetails> list=new ArrayList<EmployeeDetails>();
static 	LinkedHashSet<EmployeeDetails> l=new LinkedHashSet<EmployeeDetails>();
static EmployeeDetails em;
static int i=0;
static sorting sort;
static Employee value;
@SuppressWarnings("unchecked")
static Scanner scanner=new Scanner(System.in);
public static void main(String[] args)   
{  int a=1;
employeework();
	while(a==1)
	{System.out.println("enter yor choice");
	System.out.println("1.display the to string");
	System.out.println("2.to display total salary of department");
	System.out.println("3.update employee.csv");
	System.out.println("4.sorted employees.csv");
	System.out.println("5.delete employees.csv");
	int b=scanner.nextInt();
	switch(b) {
	case 1:output();
	break;
	case 2:dept();
	break;
	case 3:update();
	//employeework();
	output();
	break;
	case 4:sorting();
	break;
	case 5:deleteEmployee();
	break;
	}
		
	}

}
private static void deleteEmployee() {
	// TODO Auto-generated method stub
	System.out.println("Enter the id to be deleted");
	String del=scanner.next();
			
		int i=0;
		String line = "";  
		String splitBy = ",";  
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Bcp\\Downloads\\Employees (1).csv"));  

		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{
			
			  

		String[] employee = line.split(splitBy);// use comma as separator
		if(i!=0 ) {
				if(employee[0].compareTo(del)!=0)  {
		EmployeeDetails emp=createBook(employee);
		list.add(emp);
		//System.out.println("[Employee ID" + employee[0]+ "," + "Name=" + employee[1] +", "+ " Department=" + employee[2] + ","+" Manager" + employee[3] +"," +" Gross Salary= " + employee[4] + ","+ " Experience= " + employee[5] +"]");  
		}
		}i++;
		}  
		
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}
		updateDataToCSV();
		
		
	
}
private static void sorting() {
	// TODO Auto-generated method stub
	System.out.println("1.employeeId");
	System.out.println("2.employeeName");
	System.out.println("3.employeeDepartment");
	System.out.println("4.employeeSalary");
	System.out.println("5.employeeManager");
	System.out.println("6.employeeExperience");
	System.out.println("enter the choice");
	int ab=scanner.nextInt();
	switch(ab) {
	case 1:Collections.sort(list, new EmloyeeId());
	break;
	case 2:Collections.sort(list, new EmloyeeName());
	break;
	case 3:Collections.sort(list, new EmloyeeDepartment());
	break;
	case 4:Collections.sort(list, new EmloyeeManager());
	break;
	case 5:Collections.sort(list, new EmloyeeSalary());
	break;
	case 6:Collections.sort(list, new EmloyeeExperience());
	break;
	}
	writeDataToCSV();
	
}
private static void update() {
	// TODO Auto-generated method stub
	for(EmployeeDetails d :list) {
		if(d.getName()=="Sundar Ramanujam")
			em.setManager("Anshuman Gupta");
		updateDataToCSV();
	}
}
private static void dept() {
	// TODO Auto-generated method stub
	int salary=0;
	System.out.println("enter the department(IT,Sales,Marketing)");
	String b=scanner.next();
	for(EmployeeDetails d : l) {
		if(b.equals(d.department)) {
			salary=salary+d.grosssalary;
		}
	}
	System.out.println("total salary of"+b+" is "+salary);
	
}
private static void output() {
	// TODO Auto-generated method stub
	System.out.println(list);
}
public static void employeework(){
	String line = "";  
	String splitBy = ",";  
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Bcp\\Downloads\\Employees (2).csv"));  

	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{
		
		  

	String[] employee = line.split(splitBy);// use comma as separator
	if(i!=0) {
	EmployeeDetails emp=createBook(employee);
	l.add(emp);}
	//System.out.println("[Employee ID" + employee[0]+ "," + "Name=" + employee[1] +", "+ " Department=" + employee[2] + ","+" Manager" + employee[3] +"," +" Gross Salary= " + employee[4] + ","+ " Experience= " + employee[5] +"]");  
	i++;
	}  
	
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}
	
	System.out.println();
	try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Bcp\\Downloads\\Employees (2).csv"));) {  
		String linee = br.readLine();
		int d=1;
	while (linee != null) { 
		String[] attributes = linee.split(",");
		String b=attributes[3];
		for(EmployeeDetails a: l) {
		//	System.out.println(attributes[3]+" "+a.employeeid);
			if(attributes[3].equals(a.employeeid)){ 
			attributes[3]=a.name;
			//System.out.println(a.name);
		}
			}
		if(b==attributes[3])
		attributes[3]="none of manager";
		if(d!=1) {
		EmployeeDetails book = createBook(attributes); 
		list.add(book);
		}
		//System.out.println("[Employee ID" + attributes[0]+ "," + "Name=" + attributes[1] +", "+ " Department=" + attributes[2] + ","+" Manager=" + attributes[3] +"," +" Gross Salary= " + attributes[4] + ","+ " Experience= " + attributes[5] +"]");  
		linee = br.readLine();
		d++;
		
		}

	} catch (IOException ioe) 
	{ ioe.printStackTrace(); }




	//System.out.println(l);
	//System.out.println(list);

}
private static EmployeeDetails createBook(String[] metadata) {
	String id = metadata[0];
	String name = metadata[1];
	String Department = metadata[2];
	int salary = Integer.parseInt(metadata[4]);
	int experience = Integer.parseInt(metadata[5]);
	String manager = metadata[3]; // create and return book of this metadata 
	return new EmployeeDetails(id,name,Department,manager, salary,experience); 
	}

public static void writeDataToCSV() {

		
			String DELIMITER = ",";
			String NEW_LINE_SEPARATOR = "\n";
			String FILE_HEADER = "Emp Id,Emp Name,Department,Manager Emp Id,Gross Salary [In INR],Experience In Years";

			try {
				FileWriter fileWriter = new FileWriter(
						"C:\\Users\\Bcp\\\\Downloads\\sorted.csv");
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter);
				printWriter.append(FILE_HEADER + NEW_LINE_SEPARATOR);
				for (EmployeeDetails employee : list) {
					printWriter.append(employee.getEmployeeid() + DELIMITER + employee.getName() + DELIMITER
							+ employee.getDepartment() + DELIMITER + employee.getManager() + DELIMITER
							+ employee.getGrosssalary() + DELIMITER + employee.getExperience()
							+ NEW_LINE_SEPARATOR);
				}
				printWriter.flush();
				printWriter.close();
				System.out.println("Successfully Created SortedEmployee CSV File");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
}
public static void updateDataToCSV() {

	
	String DELIMITER = ",";
	String NEW_LINE_SEPARATOR = "\n";
	String FILE_HEADER = "Emp Id,Emp Name,Department,Manager Emp Id,Gross Salary [In INR],Experience In Years";

	try {
		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\Bcp\\Downloads\\Employeees.csv");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		PrintWriter printWriter = new PrintWriter(bufferedWriter);
		printWriter.append(FILE_HEADER + NEW_LINE_SEPARATOR);
		for (EmployeeDetails employee : list) {
			printWriter.append(employee.getEmployeeid() + DELIMITER + employee.getName() + DELIMITER
					+ employee.getDepartment() + DELIMITER + employee.getManager() + DELIMITER
					+ employee.getGrosssalary() + DELIMITER + employee.getExperience()
					+ NEW_LINE_SEPARATOR);
		}
		printWriter.flush();
		printWriter.close();
		System.out.println("Successfully Created Employeees CSV File");

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}

}



