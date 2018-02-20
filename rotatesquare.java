import java.util.*;
import java.lang.*;
import java.io.*;

class RotateSquare {
 public static void main (String[] args){ 
	int t,temp;
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	while(t>0){
	   int n;
              String str="";
	      n=sc.nextInt();
	      int[][] a=new int[n][n];
	       for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++)
		     a[i][j]=sc.nextInt();
		    }
		  for(int i=0;i<n;i++){
		     for(int j=0,k=n-1;j<k;j++,k--){
		          temp=a[i][j];
		          a[i][j]=a[i][k];
		          a[i][k]=temp;
		       }
		    }
		  for(int i=0;i<n;i++){
		     for(int j=i;j<n;j++){
		        temp=a[i][j];
		        a[i][j]=a[j][i];
		        a[j][i]=temp;
		       }
		    }
		  for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		           str=str+a[i][j]+" ";
		        }
		    }
		System.out.println(str);
		 t--;
         }
	}
}
