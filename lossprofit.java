/*
Chef recently opened a big e-commerce website where her recipes can be bought online. It's Chef's birthday month and so she has decided to organize a big sale in which grand discounts will be provided.

In this sale, suppose a recipe should have a discount of x percent and its original price (before the sale) is p. Statistics says that when people see a discount offered over a product, they are more likely to buy it. Therefore, Chef decides to first increase the price of this recipe by x% (from p) and then offer a discount of x% to people.

Chef has a total of N types of recipes. For each i (1 ≤ i ≤ N), the number of recipes of this type available for sale is quantityi, the unit price (of one recipe of this type, before the x% increase) is pricei and the discount offered on each recipe of this type (the value of x) is discounti.

Please help Chef find the total loss incurred due to this sale, if all the recipes are sold out.
*/

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
