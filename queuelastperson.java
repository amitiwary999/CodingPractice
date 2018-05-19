/*
Some people are standing in a queue. A selection process follows a rule where people standing on even positions are selected. Of the selected people a queue is formed and again out of these only people on even position are selected. This continues until we are left with one person. Find out the position of that person in the original queue.
Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,number of people standing in a queue.

Output:
Print the position(original queue) of that person who is left.

Constraints:
1 ≤ T ≤ 1000
1 ≤ N ≤ 100000000
*/
import java.util.*;
import java.lang.Math;

class QueueLastPerson{

 public static void main(String args[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of person in queue");
  long num = sc.nextLong();
  String binNum = Long.toBinaryString(num);
  int length = binNum.length();
  long ans = (long)Math.pow(2, length-1);
  System.out.println(ans);
 }
}
