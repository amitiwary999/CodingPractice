import java.util.*;

class AlternatePosNeg{

  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of items in array");
   int size = sc.nextInt();
   int arrPos[] = new int[size/2];
   int arrNeg[] = new int[size/2];
   int flagn=0,flagp=0;
   System.out.println("Enter numbers");
   for(int i=0;i<size;i++){
    int num = sc.nextInt();
    if(num<0){
      arrNeg[flagn++] = num;
    }else{
      arrPos[flagp++] = num;
    }
   }
  for(int i=0;i<size/2;i++){
   System.out.print(arrPos[i]+" "+arrNeg[i]+" ");  
  }
 }
}
