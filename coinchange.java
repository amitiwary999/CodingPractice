import java.util.*;

class coinChange{

  public void change(int coins[], int sum){
   int total[] = new int[sum+1];
   Arrays.fill(total, 0);
   total[0] =1;
   for(int i=0; i<coins.length; i++){
    for(int j=coins[i]; j<=sum; j++){
     total[j] += total[j-coins[i]];
    }
   }
   System.out.println(total[sum]);
  }
  public static void main(String args[]){
   coinChange cc = new coinChange();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of coins present");
   int count = sc.nextInt();
   int coins[] = new int[count];
   System.out.println("Enter the different coins");
   for( int i=0; i<count; i++) {
     coins[i] = sc.nextInt();
    }
   System.out.println("Enter sum required");
   int sum = sc.nextInt();
   cc.change(coins, sum);
  }
}
