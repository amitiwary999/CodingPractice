import java.util.*;

class LCS {

  public void calculateLCS(String str1, String str2) {
  int length[][] = new int[str1.length()+1][str2.length()+1];
  int word[] = new int[str1.length()];
  int k =0;
  for(int i =0; i<=str1.length(); i++) {
     for(int j=0; j<=str2.length(); j++) {
         if(i == 0 || j == 0){
         length[i][j] = 0;
        }else if(str1.charAt(i-1) == str2.charAt(j-1)) {
         length[i][j] = length[i-1][j-1]+1; 
        } else {
         length[i][j] = length[i-1][j]>length[i][j-1]?length[i-1][j]:length[i][j-1];
        } 
      }
    } 
   System.out.println(length[str1.length()][str2.length()]);
  }
  public static void main(String args[]) {
  LCS lcs = new LCS();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter both strings");
  String str1 = sc.nextLine();
  String str2 = sc.nextLine();
  lcs.calculateLCS(str1, str2);
 }
}
