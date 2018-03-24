/*
Given a binary array and an integer m, find the maximum number of consecutive 1's produced by flipping 0's. You can flip maximum m zeroes.
Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, the first line contains an integer 'N' denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.  Third line consists of an integer m that is maximum number of flips allowed.

Output:
Output the maximum numbers of consecutive 1's. (Indices begin from 0).

Constraints:
1<=T<=31
1<=N<=100
1<=m<=N

Example:
Input:
1
11
1 0 0 1 1 0 1 0 1 1 1
2
Output:
8
Explaination: 
Input:   arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
         m = 2
Output:  8
We are allowed to flip maximum 2 zeroes. If we flip
arr[5] and arr[7], we get 8 consecutive 1's which is
maximum possible under given constraints
*/
import java.util.*;

class ConsecutiveOne{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size = sc.nextInt();
  int array[] = new int[size];
  System.out.println("Enter elements of array");
  for(int i = 0; i<size; i++){
   array[i] = sc.nextInt();
  }
  System.out.println("Enter the numbers of zeros to be replaced");
  int replaceZero = sc.nextInt();
  int j=0, startIndex=0, max=0; 
  while(j<size){
   if(array[j] == 0){
    if(replaceZero > 0){
     replaceZero--;
    }else{
     while(startIndex <= j && array[startIndex++]!= 0){
     }
    } 
   }
   j++;
   max = Math.max(max, j-startIndex);
  } 
  System.out.println(max); 
 }
}     
