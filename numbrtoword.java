import java.util.*;

class numbrtoword{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int num =sc.nextInt();
  String arr1[] = new String[]{ "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  String arr2[] = new String[]{"ten", "twenty","thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
  int rem,count=0;
  String ans="";
  while(num >0){
  rem = num%10;
  num = num/10;
  count++;
  switch(count){
   case 1:
   if(rem >0){
    ans=arr1[rem-1]; 
   }
    break;

   case 2:
    if(rem >0){
     ans = arr2[rem-1]+" "+ans;
     }
    break;

   case 3:
    if(rem >0){
     ans = arr1[rem-1]+"hundred "+ans;
    }
    break;
 
   case 4:
    ans = arr1[rem-1]+"thousand "+ans;
    break;
   }
  }
 System.out.println(ans);
 }
}
