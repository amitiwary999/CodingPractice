import java.util.*;
import java.lang.*;
import java.io.*;

class second {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		for(int i = 0; i<flag; i++) {
		    int count = 0;
		    int countback = 0;
		    String data = sc.next();
		    StringBuilder sb = new StringBuilder(data);
		    for(int index = 0; index<sb.length(); index++) {
		        if(index%2 == 0) {
		            if(Integer.parseInt(String.valueOf(sb.charAt(index))) != Integer.parseInt(String.valueOf(sb.charAt(0)))) {
		                count++;
		            } else {
		                countback++;
		            }
		        } if(index%2 != 0){
		            if(Integer.parseInt(String.valueOf(sb.charAt(index))) == Integer.parseInt(String.valueOf(sb.charAt(0)))) {
		                count++;
		            } else {
		                countback++;
		            }
		        } 
		    }
		   System.out.println(count<countback?count:countback); 
		}
	}
}
