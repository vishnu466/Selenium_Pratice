package Air;


import java.util.*;

public class Leaderboard {

	public static void main(String[] args) {
		List<Integer> rank = new ArrayList<>(Arrays.asList(100 ,90, 90, 80, 75,60));
		List<Integer> player =new ArrayList<>(Arrays.asList(50 ,65, 77, 90, 102));
		
		
		for(Integer i : player) {
			rank.add(i);
			TreeSet<Integer> ts = new TreeSet<>(rank);
			//System.out.println(ts);
			List<Integer> lst = new ArrayList<>(ts);
			Collections.sort(lst,Collections.reverseOrder());
			//System.out.println(lst);
			System.out.println(lst.indexOf(i)+1);
			rank.remove(i);
		}
			
			
			
		
		
		
			
		
		
		
		
	}

	

}
