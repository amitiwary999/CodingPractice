/*
Given number into words. For example, if “1234” is given as input, output should be “one thousand two hundred and thirty four”
Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N.

Output:
Print the number into words (in small letter).
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 9999

Example:
Input:
2
2
142
Output:
two
one hundred and forty two

*/
import java.util.*;

class numbrtoword{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int num =sc.nextInt();
  String arr1[] = new String[]{ "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  String arr2[] = new String[]{"ten", "twenty","thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
  int rem,count=0;
  String ans="";
  while(num >0){
  rem = num%10;
  num = num/10;
  count++;
  switch(count){
   case 1:
   if(rem >0){
    ans=arr1[rem-1]; 
   }
    break;

   case 2:
    if(rem >0){
     ans = arr2[rem-1]+" "+ans;
     }
    break;

   case 3:
    if(rem >0){
     ans = arr1[rem-1]+"hundred "+ans;
    }
    break;
 
   case 4:
    ans = arr1[rem-1]+"thousand "+ans;
    break;
   }
  }
 System.out.println(ans);
 }
}
