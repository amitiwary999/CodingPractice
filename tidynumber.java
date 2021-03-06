import java.util.*;

class TidyNumber{

 public void computeResult(){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of test cases");
   int test = sc.nextInt();
   long[] numbers = new long[test];
   String[] answer = new String[test];
   Arrays.fill(answer,"");
   for(int i=0;i<test;i++){
    long numberLong = sc.nextLong();
    String number = String.valueOf(numberLong);
    int size = number.length();
    int prevLastNumber = 10;
    int lastnumber = Integer.parseInt(Character.toString(number.charAt(size-1)));
    for(int j=size-2;j>=0;j--){
      int secondLastNumber = Integer.parseInt(Character.toString(number.charAt(j)));
      if(secondLastNumber >= lastnumber || secondLastNumber >=prevLastNumber){
        if(secondLastNumber==0){
           secondLastNumber = 9;
        }else{
        secondLastNumber--;
        }
        answer[i] = answer[i]+"9";
      }else{
        answer[i] = lastnumber+answer[i];
      }   
      prevLastNumber = lastnumber;
      lastnumber = secondLastNumber;
    }
    if(lastnumber == 0){
      System.out.println(answer[i]);
    }else{
      System.out.println(lastnumber+answer[i]);
    }
   }
  
  
 }

 public static void main(String[] args){
  TidyNumber tn = new TidyNumber();
  tn.computeResult();
 }
}
