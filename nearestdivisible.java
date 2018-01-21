/*
Given two integers n and m. The problem is to find the number closest to n and divisible by m. If there are more than one such number, then output the one having maximum absolute value. If n is completely divisible by m(not equal to 0), then output n only. Time complexity of O(1) is required.
*/
import java.util.*;

class NearestDivisible{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter n and m");
  int n = sc.nextInt();
  int m = sc.nextInt();
  int factor = n%m;
  if(factor == 0){
    System.out.println(n);
  }else{
   if((n+factor)%m == 0){
    System.out.println(n+factor);
   }else{
    System.out.println(n-factor);
   }
  }
 }
}
