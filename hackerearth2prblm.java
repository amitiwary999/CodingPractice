import java.util.*;

class HackerEarthPrblm2{

 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of testcases");
  int testCases = sc.nextInt();
  int results[] = new int[26];
  ArrayList<Integer> posorder = new ArrayList();
  int posorder1[] = new int[26];
  for(int i=0; i<testCases; i++){
sc.nextLine();
    System.out.println("Enter the string");
    String str = sc.nextLine();
    int strLength = str.length();
    for(int j=0;j<strLength;j++){
     results[str.charAt(j) - 'a']++;
    }
    int flag = 0;
    for(int j=0;j<25;j++){
      int big = results[j];
      int pos = j;
      for(int k=j+1; k<26; k++){
       if(big<results[k]){
          big = results[k];
          pos = k;
       }
    }
      if(big >0){
      int temp = results[j];
      results[j] = results[pos];
      results[pos] = temp;
      posorder.add(pos);
      posorder1[pos] = -1;
   }
   }
  for(int j=0; j<posorder.size(); j++){
     System.out.print((char)(posorder.get(j)+97)+" ");
   }
 for(int j=0;j<26;j++){
  if(posorder1[j] != -1){
    System.out.print((char)(j+97)+" ");
  }
 }
  }
 }
} 
