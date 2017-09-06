import java.util.*;
import java.lang.*;
import java.io.*;

class third {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		for(int i = 0; i<flag; i++){
		    int max = 0;
		    Long answer = 0L;
		    int count = sc.nextInt();
		   for(int j = 0;j<count;j++){
		       int ans = 0;
		       Long var = sc.nextLong();
		       Long check = var;
		       while(var>0) {
		            if(var%10 == 0) {
		                ans++;
		            }
		            var = var/10;
		        }
		        if(max<ans) {
		            max = ans;
		            answer = check;
		        } else if(max == ans){
		            answer = answer<check?check:answer;
		        }
		   }
		    System.out.println(answer);
		}
	}
}
