import java.util.*;

class DiffOfSen{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter sentence");
  String sen = sc.nextLine();
  String[] senArray = sen.split(" ");
  String[] vowel = {"a","e","i","o","u"};
  String[] consonant = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"}; 
  //ArrayList<String> vawelArr = Arrays.asList(vowel);
  ArrayList<String> consonantArr = new ArrayList<String>(Arrays.asList(consonant));
  int flag;
  int conseconst = 0;
  int nov=0,noc=0,hardword=0,easyword=0;
  for(int i=0;i<senArray.length;i++){
   flag = 0;
   ArrayList<String> word = new ArrayList<String>(Arrays.asList(senArray[i].split("")));
   for(int j=0;j<word.size();j++){
    if(consonantArr.contains(word.get(i))){
     conseconst++;
     noc++; 
    }else{
      nov++;
      conseconst = 0;
    }
   if(conseconst == 4){
     hardword++;
     flag = 1;
     break;
    }
   }
  if(flag == 0){
   if(noc>nov){
    hardword++;
    }else{
     easyword++;
    }
   }
  }
 System.out.println(5*hardword+3*easyword);
 }
}
