/*
Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.
Input:
First line of the input contains no of test cases  T,the T test cases follow.
Each test case consist of 2 space separated integers A and B denoting the size of string str1 and str2 respectively
The next two lines contains the 2 string str1 and str2 .

Output:
For each test case print the length of longest  common subsequence of the two strings .
*/

import java.util.*;

class AmazonQue22{
 
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter both string");
   String first = sc.nextLine();
   String second = sc.nextLine(); 
   int firstSize = first.length();
   int secondSize = second.length();
   int count[][] = new int[firstSize+1][secondSize+1];
   for(int i=0; i<=firstSize; i++){
   for(int j=0; j<=secondSize; j++){
    if(i == 0 || j == 0){
     count[i][j] = 0;
    }else if(first.charAt(i-1) == second.charAt(j-1)){
     count[i][j] = count[i-1][j-1]+1;
   }else{
     count[i][j] = count[i][j-1] > count[i-1][j] ? count[i][j-1] : count[i-1][j];
   }
  }
 }
 System.out.println(count[firstSize][secondSize]);
 }
}

 
