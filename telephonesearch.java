import java.util.*;

class TelephoneSearch{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of string");
  int nos = sc.nextInt();
  sc.nextLine();
  System.out.println("Enter Strings");
  String contacts = sc.nextLine(); 
  String[] contact = contacts.split(" ");
  ArrayList<String>[] listofstring = new ArrayList[nos];
  for(int i=0;i<nos;i++){
   listofstring[i] = new ArrayList<String>(Arrays.asList(contact[i].split("")));
  }
  System.out.println("Enter search string");
  String search = sc.nextLine();
  String[] arr = search.split("");
  ArrayList<Integer> blacklist = new ArrayList<Integer>();
  StringBuilder sb = new StringBuilder();
  for(int i=0;i<arr.length;i++){
   for(int j=0;j<nos;j++){
    if(!blacklist.contains(j)){
     if(listofstring[j].contains(arr[i])){
      System.out.print(String.join("",listofstring[j])+" ");
     }else{
      blacklist.add(j);
     }
    }
   }
  if(blacklist.size() == nos){
   System.out.print("0");
  }
  System.out.println("");
  }
 }
}
