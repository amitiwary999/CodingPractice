/*
 Two strings are given. Modify 1st string such that all the common characters of the 2nd strings have to be removed and the uncommon      characters  of the 2nd string have to be concatenated with uncommon characters of the 1st string.
*/
import java.util.*;

class AddUncommon{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter both strings");
  String first =  sc.nextLine();
  String second = sc.nextLine();
  String[] arr = first.split("");
  ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(first.split("")));
  ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(second.split("")));
  for(int i=0;i<list1.size() || i<list2.size(); i++){
   if(list2.contains(arr[i])){
    list1.removeAll(Arrays.asList(arr[i]));
    list2.removeAll(Arrays.asList(arr[i]));
   }
  }
  list1.addAll(list2);
  for(int i=0;i<list1.size();i++){
   System.out.print(list1.get(i));
  } 
 }
}
