/*
Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
 
Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
 
Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.
 
Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 1000
-100 ≤ A[i] <= 100
 
Example:
Input
2
3
1 2 3
4
-1 -2 -3 -4
Output
6
-1
*/
import java.util.*;

class MaxSumArray{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  int sum = 0,prevSum=0;
  for(int i=0;i<n;i++){
   arr[i] = sc.nextInt();
   prevSum = prevSum+arr[i];
   if(prevSum > sum){
     sum = prevSum;
   }
  if(prevSum < 0){
    prevSum = 0;
   }
  }
  System.out.println(sum);
 }
}
