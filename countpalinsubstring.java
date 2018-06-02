import java.util.*;

class CountPalinSubstring{
 
 static int ans = 0;
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter String");
  String str = sc.next();
  int length = str.length();
  for(int i=0;i<length;i++){
   for(int j=i;j<=length;j++){
    String sub = str.substring(i, j);
    palinCheck(sub, sub.length());
   }
  }
  System.out.println(ans);
 }
  
 public static void palinCheck(String str, int length){
  boolean flag = true;
  if(length > 1){
  for(int i=0;i<length;i++){
    if(str.charAt(i) != str.charAt(length-1-i)){
      flag = false;
      break;
    }
  }
  if(flag){
   ans++;
  }
 }
 }
}
  
