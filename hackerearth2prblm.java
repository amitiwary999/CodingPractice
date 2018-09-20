import java.util.*;

class HackerEarthPrblm2{

 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of testcases");
  int testCases = sc.nextInt();
  int letterCount[] = new int[26];
  ArrayList<Integer> printLetterPresent = new ArrayList();
  int printLetterNotPresent[] = new int[26];
  for(int i=0; i<testCases; i++){
sc.nextLine();
    System.out.println("Enter the string");
    String str = sc.nextLine();
    int strLength = str.length();
    for(int j=0;j<strLength;j++){
     letterCount[str.charAt(j) - 'a']++;
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
      int temp = letterCount[j];
      letterCount[j] = letterCount[pos];
      letterCount[pos] = temp;
      printLetterPresent.add(pos);
      printLetterNotPresent[pos] = -1;
   }
   }
  for(int j=0; j<printLetterPresent.size(); j++){
     System.out.print((char)(printLetterPresent.get(j)+97)+" ");
   }
 for(int j=0;j<26;j++){
  if(printLetterNotPresent[j] != -1){
    System.out.print((char)(j+97)+" ");
  }
 }
  }
 }
} 
