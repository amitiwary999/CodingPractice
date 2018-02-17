import java.util.*;
import java.lang.*;
import java.io.*;

class PatternRegex {
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	int totaltestCases = s.nextInt();
	for( int i = 0 ;i< totaltestCases ; i++){    
		 String pattern = s.next();
		 String searchString = s.next();
		 boolean res = regex( pattern , searchString);
		 System.out.println(res == true ? 1 : 0);
	}
    }
  static  boolean  regex( String p , String s){
        int pl = p.length();
	int il = s.length();
	if(p.charAt(0) == '^'){    
	       if( il < pl - 1){
	       return false;
	     }
	return (p.substring(1,pl)).equals(s.substring(0,pl-1));
       }
	else if(p.charAt(pl-1) == '$'){
	          if( il < pl -1 ){
	            return false;
	        }
	       return (p.substring(0,pl-1)).equals(s.substring(il-pl+1));
	     }
	else{
	  return (s.contains(p));
	}
   }
}
