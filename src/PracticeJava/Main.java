package PracticeJava;

import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
    public static Hosteller getHostellerDetails(){
    	Hosteller obj = new Hosteller();
    	System.out.println("Enter the Details:");
        System.out.println("Student Id");
        obj.setStudentId(sc.nextInt());
        //sc.nextLine();
        System.out.println("Student Name");
        obj.setName(sc.nextLine());
        System.out.println("Department Id");
        obj.setDepartmentId(sc.nextInt());
        //sc.nextLine();
        System.out.println("Gender");
        obj.setGender(sc.nextLine());
        System.out.println("Phone Number");
        obj.setPhone(sc.nextLine());
        System.out.println("Hostel Name");
        obj.setHostelName(sc.nextLine());
        System.out.println("Room Number");
        obj.setRoomNumber(sc.nextInt());
        //sc.nextLine();
        return obj;
    }
    public static void main(String args[]){
        Hosteller hst = getHostellerDetails();
        System.out.println("Modify Room Number(Y/N)");
        String prompt = sc.nextLine();
        int new_roomNumber=0;
        if(prompt.equals("Y")) {
        	System.out.println("New Room Number");
            new_roomNumber = sc.nextInt();
            hst.setRoomNumber(new_roomNumber);
        }
        System.out.println("Modify Phone Number(Y/N)");
        sc.nextLine();
        String prompt1 = sc.nextLine();
        String newPhone = "";
        if(prompt1.equals("Y")) {
        	System.out.println("New Phone Number");
            newPhone = sc.nextLine();
            hst.setPhone(newPhone);
        }
        System.out.println(hst.toString());
    }
}