import java.util.*;
import java.lang.*;
class KchangePalin {
  public void Kcount(String str, int k){
   char[] palin = str.toCharArray();
   char[] chars = str.toCharArray();
   int l=0; int r=str.length()-1;
   while(l<r){
      if(chars[l]>chars[r]){
      palin[r] = chars[l];
      k--;
     }else if(chars[l]<chars[r]) {
      palin[l] = chars[r];
      k--;
    }
   l++;
   r--;
   }
  if(k<0){
    System.out.println("Not Possible");
   }
  else {
    System.out.println(String.valueOf(palin));
   } 
  }
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  KchangePalin kcp = new KchangePalin();
  System.out.println("Enter string and k value");
  String str = new String();
  str = sc.next();
  int k = sc.nextInt();
  kcp.Kcount(str, k);
  }
}
