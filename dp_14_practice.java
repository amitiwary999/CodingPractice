import java.util.*;

class DP_14_PRACTICE{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int size = sc.nextInt();
   int ans1 = 0;
  // sc.next();
   String str = sc.next();
   int ans[][] = new int[size+1][size+1];
   
for(int i=0; i<size; i++){
 ans[i][i] = 1;
}

  for(int i=2; i<=size; i++){
   for(int j=0; j<=size-i; j++){
     int k = i+j-1;
     char c1 = str.charAt(j); 
     char c2 = str.charAt(k);
     int bol = ans[j+1][k-1];

    if(bol == 1 && (c1 == c2)){
      ans[j][k] = 1;
      ans1 = i;
    }
   }
  }

  System.out.println(ans1);
 }
}
