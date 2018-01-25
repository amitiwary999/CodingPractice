import java.util.*;

class FindCarries{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter both numbers");
  String numbers = sc.nextLine();
  String[] number = numbers.split(" ");
  ArrayList<String> number1 = new ArrayList<String>(Arrays.asList(number[0].split("")));
  ArrayList<String> number2 = new ArrayList<String>(Arrays.asList(number[1].split("")));
  int carry = 0;
  int ans = 0; 
  int i = number1.size()-1;
  int j = number2.size()-1;
  for(;i>=0||j>=0;i--,j--){
   int sum = Integer.parseInt(number1.get(i))+Integer.parseInt(number2.get(j))+carry;
   if(sum >= 10){
    carry = 1;
    ans++;
   }else{
    carry = 0;
   }
  }
  System.out.println(ans);
 }
}
