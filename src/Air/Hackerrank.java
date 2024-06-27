package Air;

import java.io.*;
import java.util.*;


class Result {
    public static String encryption(String s) {
        String str = s.replaceAll(" ","");
        int l = str.length();
        int row = (int)Math.floor(Math.sqrt(l));
        int col = (int)Math.ceil(Math.sqrt(l));
        if(row*col<str.length()) {
        	if(row<col) {
        		row++;
        	}
        	else {
        		col++;
        	}
        }
        char[][] st = new char[row][col];
        int len = str.length();
        int k = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(k<len){
                    st[i][j] = str.charAt(k);
                    k++;
                }
            }
        }
        String s1 = "";
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
        		if(j==row-1)
            		s1+=st[j][i]+" ";    
            	else
            		s1+=st[j][i];
            	
            }
        }
        
        return s1.replaceAll("\u0000","");

    }

}//imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
//ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots

public class Hackerrank {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = Result.encryption(s);
        System.out.println(result);
        sc.close();
    }
}

