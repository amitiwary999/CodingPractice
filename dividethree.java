import java.util.*;
import java.lang.*;

class DivideThree {

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number in binary format");
  String str = sc.next();
int length = str.length();
  long sum = 0;
  for(int i=0;i<length;i++){
   int num = str.charAt(i) - '0';
   sum =sum+(long)(Math.pow(2.0, Double.valueOf(i)))*(num);
   if(i == length-1){
    System.out.println(sum%3 == 0?"true":"false");
   }
  }
 }
}
