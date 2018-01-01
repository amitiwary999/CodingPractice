//Matrix contains item in increasing order. output 1 if given item present else 0.
import java.util.*;
import java.lang.*;
import java.io.*;

class SearchInMatrix {
   public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of test case");
	int t = scan.nextInt();
	for (int tt = 0; tt < t; tt++) {
                System.out.println("Enter number of rows and columns");
                int n = scan.nextInt();
	        int m = scan.nextInt();
		List<Integer> li = new ArrayList<>();
                System.out.println("Enter items");
		for (int ii = 0; ii < n; ii++) {
		       for (int jj = 0; jj < m; jj++) {
		          li.add(scan.nextInt());
		        }
		    }
                    System.out.println("Enter item to search");
		    int k = scan.nextInt();
		    if (li.contains(k)) System.out.println(1);
		    else System.out.println(0);
		}
	}
}
