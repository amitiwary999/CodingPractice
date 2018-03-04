import java.util.*;

class LossProfit{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  float ans = 0f;
  for(int i=0;i<n;i++){
   int price = sc.nextInt();
   int quantity = sc.nextInt();
   int dis = sc.nextInt();
   int mul = 0;
   if(dis > 0){
     mul = dis*quantity*price;
     ans = (mul/1000f)+ans;
   }
   System.out.println(ans);
  }
 System.out.println(ans);
 }
}
