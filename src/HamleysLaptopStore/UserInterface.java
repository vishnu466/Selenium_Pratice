package HamleysLaptopStore;

import java.util.Scanner;

public class UserInterface {
	public static LaptopInfo extractDetails(String laptop) {
		String lap[] = laptop.split(":");
		return new LaptopInfo(lap[0],lap[1],lap[2],Double.parseDouble(lap[3]));
	}
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the laptop details");
		LaptopInfo l = extractDetails(sc.nextLine());
		if(l.calculateLaptopCost() != -1) {
			System.out.println("Lapcost Details");
			System.out.println("Laptop Id:"+l.getLaptopId());
			System.out.println("Model Name:"+l.getModelName());
			System.out.println("Brand Name:"+l.getBrandName());
			System.out.println("Laptop Cost:"+l.calculateLaptopCost());
		}
		else {
			System.out.println("Invalid laptop details");
		}
		
	}
}
