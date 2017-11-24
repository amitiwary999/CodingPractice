import java.util.*;

class CountPalinSubSeq {

 public void calculateSubSeq(String str){
 int len = str.length();
 int[][] calculate = new int[len+1][len+1];
 for(int i=0; i<len; i++){
   calculate[i][i] = 1;
  } 
 
 for(int l=2;l<=len;l++){
  for(int i=0;i<len-l;i++){
   int k = l+i-1;
   if(k<len){
   if(str.charAt(i) == str.charAt(k)){
      calculate[i][k] = calculate[i][k-1]+calculate[i+1][k]+1;
     }else {
       calculate[i][k] = calculate[i][k-1]+calculate[i+1][k]-calculate[i+1][k-1];
     }
} 
    }
   }
  System.out.println(calculate[0][len-1]);
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  CountPalinSubSeq cps = new CountPalinSubSeq();
  System.out.println("Enter string");
  String str = new String();
  str = sc.next();
  cps.calculateSubSeq(str);
 }
}
