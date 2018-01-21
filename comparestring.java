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
