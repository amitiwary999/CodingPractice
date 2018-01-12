/*Given a decimal number m. Convert it in binary string and apply n iterations, in each iteration 0 becomes 01 and 1 becomes 10. Find kth character in the string after nth iteration.*/
import java.util.*;

class BinaryPos{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of test cases");
  int testcase = sc.nextInt();
  for(int i=0;i<testcase;i++){
   System.out.println("Enter number, number of iteration and position");
   int num = sc.nextInt();
   int ite = sc.nextInt();
   int pos = sc.nextInt();
   int mul = 1;
   int binaryVal = 0;
   while(num != 0){
    int rem = num%2;
    binaryVal = binaryVal + rem*mul;
    mul = mul*10;
    num = num/2;
   }
   String binaryval = Integer.toString(binaryVal);
   for(int j=0;j<ite;j++){
    String tempNum = "";
     for(int k=0;k<binaryval.length();k++){
       if(k>pos)
        break;
       if(binaryval.charAt(k) == '0'){
        tempNum = tempNum+"01";
     }else if(binaryval.charAt(k) == '1'){
        tempNum = tempNum+"10";
     }
    }
   binaryval = tempNum;
   }
  System.out.print("number at pos "+pos+" is ");
  System.out.println(binaryval.charAt(pos));
  }
 }
}
