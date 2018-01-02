import java.util.*;

class PresOrNot{

 public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of Test cases");
  ArrayList<String> list1 = new ArrayList<>();
  ArrayList<String> list2 = new ArrayList<>();
  int testcase = sc.nextInt();
  for(int i=0;i<testcase;i++){
   int noi = sc.nextInt();
   sc.nextLine();
   String first = sc.nextLine();
   String second = sc.nextLine();
   String str1[] = first.split(" ");
   String str2[] = second.split(" ");
   for(int j=0;j<noi;j++){
    list1.add(str1[j]);
    list2.add(str2[j]);
   }
   String regx = "!#$%&*@^~";
   for(int j=0;j<9;j++){
    if(list1.contains(Character.toString(regx.charAt(j))) && list2.contains(Character.toString(regx.charAt(j)))){
      System.out.print(regx.charAt(j)+" ");
    }
   }
  System.out.println();
  for(int j=0;j<9;j++){
    if(list1.contains(Character.toString(regx.charAt(j))) && list2.contains(Character.toString(regx.charAt(j)))){
      System.out.print(regx.charAt(j)+" ");
    }
   }
  }
 }
}
