/*
Given 2 sorted arrays A and B of size N each. Print sum of middle elements of the array obtained after merging the given arrays.
Input:
The first line contains 'T' denoting the number of testcases. Then follows description of testcases.
Each case begins with a single positive integer N denoting the size of array.
The second line contains the N space separated positive integers denoting the elements of array A.
The third line contains N space separated positive integers denoting the elements of array B.
 
Output:
For each testcase, print the sum of middle elements of two sorted arrays. The number of the elements in the merged array are even so there will be 2 numbers in the center n/2 and n/2 +1. You have to print their sum. 

Constraints:
 1<=T<=50
 1<=N<=1000
 1<=A[i]<=100000
 1<=B[i]<=100000

Example:
Input :
1
5
1 2 4 6 10
4 5 6 9 12
 
Output : 
11
*/
import java.util.*;

class PartitionSumArray{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] set = new int[n];
  for(int i = 0; i < n; ++i) {
     set[i] = sc.nextInt();
   }
  int sum = 0;
  for(int i = 0; i < n; ++i) {
    sum += set[i];
   }
  if(sum % 2 != 0) {
   System.out.println("NO");
  }
  boolean[][] dp = new boolean[n + 1][sum + 1];
  for(int i = 0; i <= sum; ++i) {
    dp[0][i] = false;				
  }
  for(int i = 0; i <= n; ++i) {
    dp[i][0] = true;
  }
  for(int i = 1; i <= n; ++i) {
    for(int j = 1; j <= sum; ++j) {
	if(j < set[i-1]) {
	   dp[i][j] = dp[i-1][j];
	}else {
	   dp[i][j] = dp[i-1][j] || dp[i-1][j-set[i-1]];
	  }
        }
     }

  if(dp[n][sum/2]) {
     System.out.println("YES");
  } else {
     System.out.println("NO");
   }
 }
}
