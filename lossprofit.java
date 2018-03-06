import java.util.*;

class LossProfit{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  for(int j=0;j<t;j++){
  int n = sc.nextInt();
  float ans = 0f;
  for(int i=0;i<n;i++){
   int price = sc.nextInt();
   int quantity = sc.nextInt();
   int dis = sc.nextInt();
   float mul = 0f;
   float disn = 0f;
   if(dis > 0){
     disn = dis/100f;
     mul = disn*(float)price;
     ans = (((float)price - (float)(price+mul)*(1-disn))*quantity)+ans;
   }
  }
 System.out.println(ans);
}
 }
}
