import java.util.*;

class CountJump{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size = sc.nextInt();
  int flag = 1;
  int ans = 0;
  int num = sc.nextInt();
  for(int i=1;i<size;i++){
    flag--;
    num = sc.nextInt();
    if(flag == 0){
     flag = num;
     ans++;
    }
  }
 if(flag >= 0){
   System.out.println(ans);
 }
}
}
