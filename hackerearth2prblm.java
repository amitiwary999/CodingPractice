import java.util.*;

class HackerEarthPrblm2{

 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of testcases");
  int testCases = sc.nextInt();
  int results[] = new int[26];
  for(int i=0; i<testCases; i++){
    System.out.println("Enter the string");
    String str = sc.nextLine();
    int strLength = str.length();
    for(int j=0;j<strLength;j++){
     results[str.charAt(j) - 'a']++;
    }
    for(int k=0;k<26;k++){

   }
  }
 }
} 
