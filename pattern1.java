import java.util.*;

class Pattern{

 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  int i = sc.nextInt();
  for(int j=0;j<i;j++){
    if(j%2 == 0){
      for(int k = 0;k<j+1;k++){
        System.out.print("*");
     } 
     for(int l =0;l<i-(j+1);l++){
        System.out.print("#");
     }
    System.out.println(""); 
  }else{
     for(int l =0;l<i-(j+1);l++){
        System.out.print("#");
     }
    for(int k = 0;k<j+1;k++){
        System.out.print("*");
     } 
   
  System.out.println("");
  }
 }
}
}
