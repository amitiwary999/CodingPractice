/*
In this challenge, you will be given an array B and must determine an array A. There is a special rule: For all i,A[i]<=B[i] . That is, A[i] can be any number you choose such that 1<=A[i]<=B[i]. Your task is to select a series of A[i] given B[i] such that the sum of the absolute difference of consecutive pairs of A is maximized. This will be the array's cost, and will be represented by the variable S below.

Function Description

Complete the cost function in the editor below. It should return the maximum value that can be obtained.

The first line contains the integer , the number of test cases.

Each of the next  pairs of lines is a test case where: 
- The first line contains an integer , the length of  
- The next line contains  space-separated integers 

Output Format

For each test case, print the maximum sum on a separate line.

Sample Input

1
5
10 1 10 1 10
Sample Output

36
Explanation

The maximum sum occurs when A[1]=A[3]=A[5]=10 and A[2]=A[4]=1. That is 
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cost function below.
    static int cost(int[] B) {
      int size = B.length;
      int[][] temp = new int[size][2];
      temp[0][0]=0;
      temp[0][1]=0;
      for(int i=1; i<size;i++){
          int num1=1;
          int num2=B[i];
          temp[i][0]=max(temp[i-1][0], temp[i-1][1]+(returnAbs(1, B[i-1])));
          temp[i][1]=max(temp[i-1][0]+returnAbs(1, num2), temp[i-1][1]+returnAbs(num2, B[i-1]));
      }
      return max(temp[size-1][0], temp[size-1][1]);
    }

    static int returnAbs(int num1, int num2){
      int b=0;
      if(num1>num2){
          b=num1-num2;
      }else{
          b=num2-num1;
      }

      return b;
    }

    static int max(int a, int b){
        return a>b?a:b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] B = new int[n];

            String[] BItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int BItem = Integer.parseInt(BItems[i]);
                B[i] = BItem;
            }

            int result = cost(B);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

