/*
Given an unsorted array of positive integers. Find the number of triangles that can be formed with three different array elements as lengths of three sides of triangles. 
Input: 
The first line of the input contains T denoting the number of testcases. First line of test case is the length of array N and second line of test case are its elements.

Output:
Number of possible triangles are displayed to the user.

Constraints:
1 <=T<= 100
3 <=N<= 100
1 <=arr[i]<= 1000
*/
import java.util.*;

class NofTriangle{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array");
  int size = sc.nextInt();
  int array[] = new int[size];
  int min = 0, temp, flag=0, ans = 0;
  System.out.println("Enter array element");
  for(int i=0;i<size;i++){
   array[i] = sc.nextInt();
  }
  for(int i=0;i<size-1;i++){
   min = array[i];
   for(int j=i+1; j<size;j++){
    if(array[j] < min){
     min = array[j];
     flag = j;
   }
  }
  temp = array[flag];
  array[flag] = array[i];
  array[i] = temp; 
 }
 for(int i=0;i<size-2;i++){
  for(int j=i+1;j<size-1;j++){
   for(int k=j+1; k<size;k++){
    if(array[i]+array[j] >array[k] && array[i]+array[k] >array[j] && array[k]+array[j] >array[i]){
     ans++;
    } 
   }
  }
 } 
 System.out.println(ans);   
 }
}
