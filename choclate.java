/*
Geek has an array Arr, where Arr[i] (1-based indexing) denotes the number of chocolates corresponding to each station. When he move from station i to station i+1 he get A[i] – A[i+1] chocolates for free, if this number is negative, he looses that many chocolates also.
He can only move from station i to station i+1, if he has non-negative number of chocolates with him.
Given the cost of one chocolate is Rs. P, help geek to find the minimum cost incurred in reaching last station from the first station (station 1).
Note: Initially Geek has 0 chocolate.
*/
import java.util.*;

class Choclate{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of station");
  int nos = sc.nextInt();
  int[] station = new int[nos];
  System.out.println("Price of each choclate");
  int price = sc.nextInt();
  System.out.println("Enter number of choclates present in different station");
  station[0] = sc.nextInt();
  int r = station[0]*price;
  int diff = 0;
  for(int i=1;i<nos;i++){
    station[i] = sc.nextInt();
    diff = diff + station[i-1]-station[i];
    if(diff<0){
      r = r+(diff*(-1)*price);
      diff = 0;
    }
  }
  System.out.println(r);
 }
}
