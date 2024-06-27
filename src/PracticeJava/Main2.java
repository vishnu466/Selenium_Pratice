package PracticeJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
	static Scanner sc = new Scanner(System.in);
	private static Map<String, Double> employeeMap=new HashMap<String, Double>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}

	public void addEmployeeDetails(String employeeName, double salary) {

		employeeMap.put(employeeName, salary);
	}

	public static EmployeeAudit findEmployee(){
		EmployeeAudit obj = x->{
			ArrayList<String> name = new ArrayList<>();
			for (Map.Entry<String,Double> entry : employeeMap.entrySet()) {
    		    if(entry.getValue()<=x){
    		       name.add(entry.getKey());
    		    }
			}
			return name;	    	
        };
		return obj;
	}
	public static void main(String[] args) {
		Main2 obj = new Main2();
		int f=0;
		while(f==0) {
			System.out.println("1.Add Employee Details \n2.Find Employee Details \n3.Exit");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter the Employee name");
				String name = sc.nextLine();
				System.out.println("Enter the Employee salary");
				double salary = sc.nextDouble();
				sc.nextLine();
				obj.addEmployeeDetails(name, salary);
				break;
			}
			case 2: {
				System.out.println("Enter the salary to be searched");
		        double salary = sc.nextDouble();
		        EmployeeAudit emp = findEmployee();
		        ArrayList<String> s = emp.fetchEmployeeDetails(salary);
		        if(s.isEmpty()) {
		        	System.out.println("No Employee Found");
		        }
		        else {
		        	System.out.println("Employee List");
		        	for(int i=0;i<s.size();i++) {
		        		System.out.println(s.get(i));
		        	}
		        }

				break;
			}
			case 3: {
				System.out.println("Let's complete the session");
				f=1;
				break;
			}

			}
		}

	}

}
