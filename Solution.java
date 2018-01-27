import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxp = 0;
        int maxn = 0;
        int diff = 0; 
        int ans = 0;
        int[] solved = new int[n]; 
        String[] names = new String[n];
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int d = in.nextInt();
            int j = in.nextInt();
            solved[a0] = j;
            names[a0] = name; 
            diff = j-d;
            maxn = maxn>diff?maxn:diff;
            if(maxn>maxp){
                ans = a0;
                maxp = maxn;
            }
        }
        // Write Your Code Here
        System.out.println(names[ans]+" "+maxn);
        in.close();
    }
}
