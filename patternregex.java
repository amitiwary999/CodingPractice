/*
Given a pattern string and a test string, Your task is to implement RegEx substring matching. If the pattern is preceded by a ^, the pattern(excluding the ^) will be matched with the starting position of the text string. Similarly, if it is preceded by a $, the pattern(excluding the ^) will be matched with the ending position of the text string. If no such markers are present, it will be checked whether pattern is a substring of test.
*/
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
