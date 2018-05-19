import java.util.*;
import java.lang.Math;

class QueueLastPerson{

 public static void main(String args[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of person in queue");
  long num = sc.nextLong();
  String binNum = Long.toBinaryString(num);
  int length = binNum.length();
  long ans = (long)Math.pow(2, length-1);
  System.out.println(ans);
 }
}
