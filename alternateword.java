/*
Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences of any character dropped(including space and consider upper and lowercase as same).
*/
import java.util.*;

class AlternateWord{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter sentence");
  String sentence = sc.nextLine();
  String[] words = sentence.split(" ");
  ArrayList<String> present = new ArrayList<String>();
  ArrayList<String> ans = new ArrayList<String>();
  for(int i=0;i<words.length;i++){
   ArrayList<String> letters = new ArrayList<String>(Arrays.asList(words[i].split("")));
   for(int j=0;j<letters.size();j++){
    if(present.contains(letters.get(j).toLowerCase()) || present.contains(letters.get(j).toUpperCase())){
     present.remove(new String(letters.get(j)));
    }else{
     ans.add(letters.get(j));
     present.add(letters.get(j));
    }
   }
   if(!present.contains(" ")){
    ans.add(" ");
    present.add(" ");
   }else{
     present.remove(new String(" "));
   }
  }
  for(int i=0;i<ans.size();i++){
   System.out.print(ans.get(i));
  }
 }
}
