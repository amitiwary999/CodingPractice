import java.util.*;

class AddBinary{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter binary strings");
  String str1 = sc.next();
  String str2 = sc.next();
  String ans = null;
  int sum = 0, carryp = 0, sum1=0;
  int length = str1.length()>str2.length()?str2.length():str1.length();
  for(int i=0;i<length;i++){
    sum = (str1.charAt(i) - '0') + (str2.charAt(i) - '0');
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
  System.out.println(ans);
 }
}
