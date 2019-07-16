/*
There are two sorted arrays A and B of size m and n respectively.

Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).

The overall run time complexity should be O(log (m+n)).
*/

public class Solution {
    // DO NOT MODIFY BOTH THE LISTS
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int size1 = a.size();
        int size2 = b.size();
        
        int counter = 0;
        int pointer1 = 0;
        int pointer2 = 0;
        double ans = 0.0;
        int ansFound = 0;
        int n = (size1<size2)?size1:size2;
       
        int evenOrOdd = 0;
        int reqPos = 0;
        
        if((size1+size2)%2 == 0){
            evenOrOdd = 1;
            reqPos = (size1+size2)/2;
        }else{
            evenOrOdd = 0;
            reqPos= ((size1+size2)/2)+1;
        }
        
        while(pointer1<size1 && pointer2<size2){
            int num1 = a.get(pointer1);
            int num2 = b.get(pointer2);
            
            if(num1 > num2){
                counter++;
                if(evenOrOdd == 0){
                  if(counter == reqPos){
                    ans = (double)b.get(pointer2);
                   ansFound = 1;
                    break;
                  }  
                }else{
                   if(counter == reqPos){
                    ans = (double)b.get(pointer2);
                    
                   }else if(counter == reqPos+1){
                       ans = (ans+(double)b.get(pointer2))/2;
                      ansFound = 1;
                       break;
                   } 
                }
                
                pointer2++;
            }else{
                counter++;
                
                if(evenOrOdd == 0){
                  if(counter == reqPos){
                    ans = (double)a.get(pointer1);
                   ansFound = 1;
                    break;
                  }  
                }else{
                   if(counter == reqPos){
                    ans = (double)a.get(pointer1);
                   
                   }else if(counter == reqPos+1){
                       ans = (ans+(double)a.get(pointer1))/2;
                       ansFound = 1;
                       break;
                   } 
                }
                
               pointer1++; 
            }
        }
        
        if(ansFound == 0){
            if(pointer1==size1){
                while(pointer2<size2){
                counter++;
                if(evenOrOdd == 0){
                  if(counter == reqPos){
                    ans = (double)b.get(pointer2);
                   ansFound = 1;
                    break;
                  }  
                }else{
                   if(counter == reqPos){
                    ans = (double)b.get(pointer2);
                    
                   }else if(counter == reqPos+1){
                       ans =( ans+(double)b.get(pointer2))/2;
            ansFound = 1;
                       break;
                   } 
                }
                
                pointer2++;
                }
            }else if(pointer2 == size2){
                while(pointer1<size1){
                counter++;
                
                if(evenOrOdd == 0){
                  if(counter == reqPos){
                    ans = (double)a.get(pointer1);
                   ansFound = 1;
                    break;
                  }  
                }else{
                   if(counter == reqPos){
                    ans = (double)a.get(pointer1);
                   
                   }else if(counter == reqPos+1){
                       ans = (ans+(double)a.get(pointer1))/2;
                       ansFound = 1;
                       break;
                   } 
                }
                
               pointer1++; 
                }
            }
        }
        
        return ans;
    }

/*

public double findMedianSortedArrays(final List<Integer> A, final List<Integer> B) {
	    int len = A.size() + B.size();
	    if(len % 2 == 1) return findKth(A, 0, B, 0, len / 2 + 1);
	    else return (findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0, len / 2 + 1)) / 2.0;
	}
	
	public int findKth(List<Integer> A, int A_start, List<Integer> B, int B_start, int k){
	    if(A_start >= A.size()) return B.get(B_start + k - 1);
	    if(B_start >= B.size()) return A.get(A_start + k - 1);
	    if(k == 1) return Math.min(A.get(A_start), B.get(B_start));
	    
	    int A_key = A_start + k / 2 - 1 < A.size() ? A.get(A_start + k / 2 - 1) : Integer.MAX_VALUE;
	    int B_key = B_start + k / 2 - 1 < B.size() ? B.get(B_start + k / 2 - 1) : Integer.MAX_VALUE;
	    
	    if(A_key < B_key){
	        return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
	    }
	    else
	       return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
	}
*/
}

