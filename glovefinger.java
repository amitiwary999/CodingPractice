import java.util.*;

class GloveFinger {

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt(); 
  for(int j=0;j<t;j++){
  int n = sc.nextInt();
  sc.nextLine();
  String str1 = sc.nextLine();
  String str2 = sc.nextLine();
  String[] no1 = str1.split(" ");
  String[] no2 = str2.split(" ");
  int flag1 = 1,flag2 = 1;
  for(int i=0;i<n;i++){
    if(flag1 == 1){
      if(Integer.parseInt(no1[i]) > Integer.parseInt(no2[i])){
        flag1 = 0;
      }
    }
    if(flag2 == 1){
     if(Integer.parseInt(no1[i]) > Integer.parseInt(no2[(n-1)-i])){
        flag2 = 0;
     }
   }
  if(flag1 == 0 && flag2 == 0){
    System.out.println("none"); 
    break;
   } 
  }
 if(flag1 == 0 && flag2 == 1){
    System.out.println("back");
  }else if(flag1 == 1 && flag2 == 0){
    System.out.println("front");
  }else if(flag1 == 1 && flag2 == 1){
   System.out.println("both");
  } 
  }   
 }
}
