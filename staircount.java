/*
There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top (order does not matter). Order does not matter means for n=4 {1 2 1},{2 1 1},{1 1 2} are considered same.
Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, an integer N will be given.

Output:
Print number of possible ways to reach Nth stair.

Constraints:
1<=T<=1000
1<=N<=100

Example:
Input:
1
4
Output:
3
*/
import java.util.*;

class StairCount{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter height of stairs");
   int height = sc.nextInt();
   int flag = height/2;
   System.out.println(flag+1);
  }
}
