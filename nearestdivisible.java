import java.util.*;

class NearestDivisible{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter n and m");
  int n = sc.nextInt();
  int m = sc.nextInt();
  int factor = n%m;
  if(factor == 0){
    System.out.println(n);
  }else{
   if((n+factor)%m == 0){
    System.out.println(n+factor);
   }else{
    System.out.println(n-factor);
   }
  }
 }
}
