package HackerrankPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(73,67,38,33));
		ArrayList<Integer> lst = new ArrayList<>();
		for(Integer i : grades){
			int r = (i/5 + 1)*5;
            if(i>=38) {
            	if((r-i)<3){
                    lst.add(r);
                }
            	else {
            		lst.add(i);
            	}
            }
            else {
            	lst.add(i);
            }
        }
		System.out.println(lst);

	}

}
