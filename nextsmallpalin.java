/*
Given a number, find the next smallest palindrome.
Input :
 The first line is number of test cases, second is size of array, third line contains digits of number with spaces in between.The input is assumed to be an array. Every entry in array represents a digit in input number. Let the array be ‘num[ ]’ and size of array be ’n’. Size of the number can be upto 1000 digits.
Output:
 In each separate line print the digits of palindrome with spaces in between.
Constraints: 
1<=T<=100
1<=n<=1000
1<=a[i]<=9
Example: 
Input: 
1
11
9 4 1 8 7 9 7 8 3 2 2
Output: 
9 4 1 8 8 0 8 8 1 4 9
*/
import java.util.*;

class NextSmallPalin{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size = sc.nextInt();
  int array[] = new int[size];
  System.out.println("Enter array");
  int flag = size%2 == 0? 1:0;
  int i=0;
  for(i=0;i<size;i++){
    array[i] = sc.nextInt();
  }
  for(i=0;i<size/2-1;i++){
   array[(size-1)-i] = array[i]; 
  }
  if(array[i] > array[(size-1)-i]){
   array[i] = array[(size-1)-i]; 
  }else{
   array[(size-1)-i] = array[i];
  }
  for(i=0;i<size;i++){
   System.out.print(array[i]+" ");
  }
 }
}
