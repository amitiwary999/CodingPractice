/*
Given an array of integers where each element represents the max number of steps that can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.
Input: 
The first line contains an integer T, depicting total number of test cases. 
Then following T lines contains a number n denoting the size of the array.
Next line contains the sequence of integers a1, a2, ..., an.

Output:
Each seperate line showing the minimum number of jumps. If answer is not possible print -1.

Constraints:
1 ≤ T ≤ 40
1 ≤ N ≤ 100
0<=a[N]<=100

Example:
Input:
1
11
1 3 5 8 9 2 6 7 6 8 9
Output:
3
*/

import java.util.*;

class MinNoJump{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
    for(int i=0;i<size; i++){
     numbers[i] = sc.nextInt();
   }
   int step = 0;
   int flag = 0;
   flag = numbers[0];
   step = numbers[0];
   int ans = 1;
   if(step == 0){
     ans = 0;
   }else{
   for(int k=1;k<flag;k++){
    if(numbers[k] + k > step){
     step = numbers[k] + k;
    }
   if(--flag == 0){
     if(k > step){
       ans = -1;
       break;
     }
     ans++;
     step = step - k;
    } 
   }
  }
 System.out.println(ans);
  
 }
} 
