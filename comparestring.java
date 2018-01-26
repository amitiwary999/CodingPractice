/*
In a native language the increasing order of priority of characters is a, b, c, d, e, f, g, h, i, j, k, l, m, n, ’ng’ , o, p, q, r, s, t, u, v, w, x, y, z. You are given two strings string1 and string2 and your task is to compare them on the basis of the given priority order.
Print ‘0’ if both the strings are equal, ‘1’ if string1 is greater than string2 and ‘-1’ if string1 is lesser than string2. All the strings consist of lowercase English alphabets only.
*/
import java.util.*;

class CompareString{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter both string");
  String input = sc.nextLine();
  String[] str = input.split(" ");
  ArrayList<String> str1 = new ArrayList<String>(Arrays.asList(str[0].split("")));
  ArrayList<String> str2 = new ArrayList<String>(Arrays.asList(str[1].split("")));
  int ans = 5;
  for(int i=0,j=0;i<str1.size()||j<str2.size();i++,j++){
   if(str1.get(i).equals("n") && str1.get(i+1).equals("g") && str2.get(j).equals("n")&&str2.get(j+1).equals("g")){
    ans = 0;
    i++;j++;
   }else if(str1.get(i).equals("n") && str1.get(i+1).equals("g") && str2.get(j).compareTo("o")>=0){
     ans = 1;
     break;
   }else if(str2.get(j).equals("n") && str2.get(j+1).equals("g") && str1.get(i).compareTo("o")>=0){
     ans = -1;
     break;
   }else if(str1.get(i).equals("n") && str1.get(i+1).equals("g") && str2.get(j).compareTo("n")<=0){
     ans = -1;
     break;
   }else if(str2.get(j).equals("n") && str2.get(j+1).equals("g") && str1.get(i).compareTo("n")<=0){
     ans = 1;
     break;
   }else if(str1.get(i).compareTo(str2.get(j))>0){
     ans = -1;
     break;
   }else if(str2.get(j).compareTo(str1.get(i))>0){
     ans = 1;
     break;
   }else{
     ans = 0;
   }
  }
  System.out.println(ans);
 }
}
