import java.util.*;

class knapSack{
 
  private void result(int value[], int weight[], int wt){
  int ks[][] = new int[value.length+1][wt+1];
  for(int i=0; i<=value.length; i++){
    for(int j=0; j<=wt; j++){
     if(i == 0 || j == 0){
      ks[i][j] = 0;
     } else if(weight[i-1] <= j){
       ks[i][j] = ks[i-1][j]>(value[i-1]+ks[i-1][j-weight[i-1]])?ks[i-1][j]:value[i-1]+ks[i-1][j-weight[i-1]];
     }else{
      ks[i][j] = ks[i-1][j];
     }
   }
  } 
 System.out.println(ks[value.length][wt]);
}
 public static void main(String args[]){
 knapSack ksack = new knapSack();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter no of item in values and weight array");
 int item = sc.nextInt();
 int value[] = new int[item];
 int weight[] = new int[item];
 System.out.println("Enter values array");
 for (int i=0; i<item; i++) {
  value[i] = sc.nextInt();
 }
 System.out.println("Enter weight array");
 for(int i=0; i<item; i++){
  weight[i] = sc.nextInt();
 }
 System.out.println("Enter required weight");
 int wt = sc.nextInt();
 ksack.result(value, weight, wt);
 }
}
