import java.io.*;
import java.util.Scanner;  

class first {
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
StringBuilder sb = new StringBuilder(s);
  //System.out.println(sb.charAt(0));
  if(Character.isLowerCase(sb.charAt(0))) {
      for(int index=0; index<sb.length();index++){
          sb.setCharAt(index, Character.toUpperCase(sb.charAt(index)));
      }
    } else {
         for(int index=0; index<sb.length();index++){
          sb.setCharAt(index, Character.toLowerCase(sb.charAt(index)));
      }
     }
  System.out.println(sb.toString());
  }
}

