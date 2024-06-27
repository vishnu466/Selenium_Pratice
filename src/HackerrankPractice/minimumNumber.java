package HackerrankPractice;

public class minimumNumber {
	public static int minimumNumbers(int n, String password) {
		int count=0;
		int len = password.length();
	    
        if(!password.matches(".*[-!@#$%^&*()+].*")){
            count++;
        }
        if(!password.matches(".*[A-Z].*")) {
        	count++;
        }
        if(!password.matches(".*[a-z].*")) {
        	count++;
        }
        if(!password.matches(".*[0-9].*")) {
        	count++;
        }
		if((count+len)<6) {
			count += 6-(count+len);
		}
			
        return count;
	    
	    
	}
	public static void main(String[] args) {
		String str = "Ab1";
		System.out.println(minimumNumbers(str.length()-1,str));
		

	}

}
