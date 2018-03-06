import java.util.*;

class LossProfit{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  for(int j=0;j<t;j++){
  int n = sc.nextInt();
  double ans = 0.0;
  for(int i=0;i<n;i++){
   int price = sc.nextInt();
   int quantity = sc.nextInt();
   int dis = sc.nextInt();
   double mul = 0.0;
   double disn = 0.0;
   if(dis > 0){
     disn = dis/100.0;
     mul = disn*(double)price;
     ans = (((double)price - (double)(price+mul)*(1-disn))*quantity)+ans;
   }
  }
 System.out.println(ans);
}
 }
}
