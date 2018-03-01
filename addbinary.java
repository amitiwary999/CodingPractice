import java.util.*;

class AddBinary{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter binary strings");
  String str1 = sc.next();
  String str2 = sc.next();
  String ans = null;
  int i;
  String newString;
  int sum = 0, carryp = 0, sum1=0;
  int length1= str1.length();
  int length2= str2.length();
  int length, lengthnew; 
  if(length1>length2){
   length = length2;
   lengthnew = length1;
   newString = str1; 
  }else{
   length = length1;
   lengthnew = length2;
   newString = str2;
  }
  for(i=1;i<=length;i++){
    sum = (str1.charAt(length1-i) - '0') + (str2.charAt(length2-i) - '0');
    if(sum == 2){
     sum = carryp;
     carryp = 1;
     if(ans!=null)
      ans = (Integer.toString(sum))+ans;
     else
      ans = (Integer.toString(sum)); 
    }else{
     sum1 = (sum+carryp)%2;
     if(sum1 == 0 && sum>0){
      carryp = 1;
     }else{
      carryp=0;
     }
    if(ans!=null)
     ans = (Integer.toString(sum1))+ans;
    else
     ans = (Integer.toString(sum1));
    }
  }
  for(int j=i;j<=lengthnew;j++){
   sum = (newString.charAt(lengthnew-j) - '0') + carryp;
   if(sum == 2){
     sum = carryp;
     carryp = 1;
     if(ans!=null)
      ans = (Integer.toString(sum))+ans;
     else
      ans = (Integer.toString(sum));
    }else{
     sum1 = (sum+carryp)%2;
     if(sum1 == 0 && sum>0){
      carryp = 1;
     }else{
      carryp=0;
     }
    if(ans!=null)
     ans = (Integer.toString(sum1))+ans;
    else
     ans = (Integer.toString(sum1));  
    }
  }
 if(carryp>0){
  ans = (Integer.toString(carryp))+ans;
 }
  System.out.println(ans);
 }
}
