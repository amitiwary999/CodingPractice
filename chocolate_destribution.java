
/*Given an array of n integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.*/

import java.util.*;

class ChocolateDistribution{

  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of students");
   int nofstudent = sc.nextInt();
   System.out.println("Enter number of packets");
   int choclatePacket = sc.nextInt();
   int[] choclates = new int[choclatePacket];
   for(int i=0; i<choclatePacket;i++){
     choclates[i] = sc.nextInt();
   }

   for(int i=0; i<choclatePacket-1; i++){
     int temp = choclates[i];
     int flag = i;
     for(int j=i+1; j<choclatePacket; j++){
      if(temp > choclates[j]){
        temp = choclates[j];
        flag = j;
      }
    }
    int test = choclates[i];
    choclates[i] = temp;
    choclates[flag] = test;
   } 
  
   int min = Integer.MAX_VALUE;
   for(int i=0; i<=choclatePacket-nofstudent; i++){
     int lowno = i;
     int highno = i+(nofstudent-1);

     int highNumber = choclates[highno];
     int lowNumber = choclates[lowno];

     int temp = highNumber - lowNumber;
     if(min > temp){
       min = temp;
     }
   } 

   System.out.println("ans "+min); 
  }
}
