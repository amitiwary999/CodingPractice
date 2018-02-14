import java.util.*;

class MobilekeyPad{

 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of test cases");
 int t = sc.nextInt();
 for(int j=0;j<t;j++){
  int num = sc.nextInt();
  int[][] ans = new int[num][10];
  for(int i=0;i<=9;i++){
   ans[0][i] = 1;
  }
  for(int i=1;i<num;i++){
   ans[i][0] = ans[i-1][0] + ans[i-1][8];
   ans[i][1] = ans[i-1][1] + ans[i-1][2] + ans[i-1][4];
   ans[i][2] = ans[i-1][2] + ans[i-1][1] + ans[i-1][3] + ans[i-1][5];
   ans[i][3] = ans[i-1][3] + ans[i-1][2] + ans[i-1][6];
   ans[i][4] = ans[i-1][4] + ans[i-1][1] + ans[i-1][5] + ans[i-1][7];
   ans[i][5] = ans[i-1][5] + ans[i-1][2] + ans[i-1][4] + ans[i-1][6] + ans[i-1][8];
   ans[i][6] = ans[i-1][6] + ans[i-1][3] + ans[i-1][5] + ans[i-1][9];
   ans[i][7] = ans[i-1][7] + ans[i-1][4] + ans[i-1][8];
   ans[i][8] = ans[i-1][8] + ans[i-1][5] + ans[i-1][0] + ans[i-1][7] + ans[i-1][9];
   ans[i][9] = ans[i-1][9] + ans[i-1][6] + ans[i-1][8];
  }
  int sum = 0;
  for(int i=0;i<=9;i++){
   sum += ans[num-1][i]; 
  }
  System.out.println(sum);
  }
 }
} 
