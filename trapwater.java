/*
Given n non-negative integers in array representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
For example:
Input:
3
2 0 2
Output:
2
Structure is like below
|  |
|_|
We can trap 2 units of water in the middle gap.
Below is another example.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
Each test case contains an integer N followed by N numbers to be stored in array.

Output:
Print trap units of water in the middle gap.

Constraints:
1<=T<=100
3<=N<=100
0<=Arr[i]<10

Example:
Input:
2
4
7 4 0 9
3
6 9 9

Output:
10
 0
*/
import java.util.*;

class TrapWater{
 
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the numbers of bar");
  int number = sc.nextInt();
  int bars[] = new int[number];
  int leftMax[] = new int[number];
  int rightMax[] = new int[number];
  int vol = 0;
  System.out.println("Enter height of bars");
  for(int i=0;i<number;i++){
   bars[i] = sc.nextInt();
  }
   for (int i = 1; i<number; i++)
    leftMax[i] = Math.max(bars[i-1], leftMax[i-1]);
   for (int i = number-2; i>0; i--)
    rightMax[i] = Math.max(bars[i+1], rightMax[i+1]);
   for (int i = 1; i<number-1; i++){
    int min = Math.min(leftMax[i], rightMax[i]) - bars[i];
    vol += min<0?0:min;
   }
  System.out.println(vol);
 }
}
