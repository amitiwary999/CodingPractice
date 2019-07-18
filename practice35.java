/*
Given expression with operands and operators (OR , AND , XOR) , in how many ways can you evaluate the expression to true, by grouping in different ways? Operands are only true and false.
Input:

string :  T|F&T^T
here '|' will represent or operator 
     '&' will represent and operator
     '^' will represent xor operator
     'T' will represent true operand
     'F' will false
Output:

different ways % MOD
where MOD = 1003
*/

public class Solution {
    public int cnttrue(String A) {
        char[] all = A.toCharArray();
        int size = all.length;
        char[] num = new char[size];
        char[] symbol = new char[size];
        int syCoun = 0;
        int numC = 0;
        
        for(int i=0; i<size; i++){
           
            if(all[i] == 'T' || all[i] == 'F'){
              num[numC] = all[i];  
              numC++;
            }else{
                symbol[syCoun] = all[i];
                syCoun++;
            }
        }
    //     System.out.println(syCoun);
    long count = (countParenth(num, symbol, numC))%1003;
        return (int)count;
    }
    
    static long countParenth(char symb[],  
                    char oper[], int n)     
    { 
        long F[][] = new long[n][n]; 
        long T[][] = new long[n][n]; 
 
        for (int i = 0; i < n; i++)  
        { 
            F[i][i] = (symb[i] == 'F') ? 1 : 0; 
            T[i][i] = (symb[i] == 'T') ? 1 : 0; 
        } 
  
        for (int gap = 1; gap < n; ++gap) 
        { 
            for (int i = 0, j = gap; j < n; ++i, ++j)  
            { 
                T[i][j] = F[i][j] = 0; 
                for (int g = 0; g < gap; g++)  
                { 
                    
                    int k = i + g; 
  
                    
                    long tik = T[i][k] + F[i][k]; 
                    long tkj = T[k + 1][j] + F[k + 1][j]; 
  
                    
                    if (oper[k] == '&')  
                    { 
                        T[i][j] += T[i][k] * T[k + 1][j]; 
                        F[i][j] += (tik * tkj - T[i][k] * T[k + 1][j]); 
                    } 
                    if (oper[k] == '|')  
                    { 
                        F[i][j] += F[i][k] * F[k + 1][j]; 
                        T[i][j] += (tik * tkj - F[i][k] * F[k + 1][j]); 
                    } 
                    if (oper[k] == '^') 
                    { 
                        T[i][j] += F[i][k] * T[k + 1][j] +  
                                    T[i][k] * F[k + 1][j]; 
                        F[i][j] += T[i][k] * T[k + 1][j] +  
                                    F[i][k] * F[k + 1][j]; 
                    } 
                } 
            } 
        } 
        return T[0][n - 1]; 
    } 
}

