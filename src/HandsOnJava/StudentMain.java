package HandsOnJava;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student s;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Student's Id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student's Name:");
		String Stud_name = sc.nextLine();
		System.out.println("Enter Student's address:");
		String Stud_address = sc.nextLine();
		
		while(true) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			String prompt = sc.nextLine();
			if(prompt.equals("yes") || prompt.equals("YES")) {
				s = new Student(id,Stud_name,Stud_address);
			}
			else if(prompt.equals("no") || prompt.equals("NO")) {
				System.out.println("Enter the college name:");
				String Clg_name = sc.nextLine();
				s = new Student(id,Stud_name,Stud_address,Clg_name);
			}
			else {
				System.out.println("Wrong Input");
				continue;
			}
			break;
		}
		
	}
}
