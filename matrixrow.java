import java.util.*;

class MatrixRow{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int m = sc.nextInt();
  int n = sc.nextInt();
  sc.nextLine();
  String numbers = sc.nextLine();
  String[] aray = numbers.split(" ");
  int ans=0;
  int count=0, min=Integer.MAX_VALUE;
  for(int i=0;i<m;i++){
   count = 0;
   for(int j=0;j<n;j++){
    int index = i*n+j;
    if(aray[index].equals("1")){
      count = count+1;
    }
   }
   if(count>min && count>0){
    min = count;
    ans = i;
   }else{
    ans = -1
   }
  }
 System.out.println(ans);
 }
}
