/*
Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
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
