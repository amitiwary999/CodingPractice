import java.util.*;
import java.lang.*;
import java.io.*;

class Knight {
    static int n,m,s1,s2,d1,d2;
    static LinkedList <String> ls;
    static boolean vs[][];
	public static void main (String[] args) {
		Scanner ss=new Scanner(System.in);
                Knight kn = new Knight();
		int t=ss.nextInt();
		for(int p=0;p<t;p++)
		{
		    n=ss.nextInt();
		    m=ss.nextInt();
		    s1=ss.nextInt()-1;
		    s2=ss.nextInt()-1;
		    d1=ss.nextInt()-1;
		    d2=ss.nextInt()-1;
		    System.out.println(kn.solve());
		}
	}
	int solve()
	{
	    vs=new boolean[n][m];
	    ls=new LinkedList<>(); 
	    vs[s1][s2]=true;
	    ls.add(s1+" "+s2+" "+0);
	    while(!ls.isEmpty())
	    {
	        String tm[]=ls.remove().split(" ");
	        int i=Integer.parseInt(tm[0]);
	        int j=Integer.parseInt(tm[1]);
	        int k=Integer.parseInt(tm[2]);
	        if((i==d1)&&(j==d2))
	        {
	            return k;
	        }
	        add(i+2,j-1,k);
	        add(i+2,j+1,k);
	        add(i-2,j-1,k);
	        add(i-2,j+1,k);
	        add(i+1,j+2,k);
	        add(i-1,j+2,k);
	        add(i+1,j-2,k);
	        add(i-1,j-2,k);
	    }
	    return -1;
	}
	void add(int i,int j,int k)
	{
	    if((i>=0)&&(j>=0)&&(i<n)&&(j<m))
	    {
	        if(!vs[i][j])
	        {                    
	            ls.add(i+" "+j+" "+(k+1));
	            vs[i][j]=true;
	        }
	    }
	}
}
