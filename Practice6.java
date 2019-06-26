public class Solution {
    public void nextPermutation(ArrayList<Integer> a) {
        int size = a.size();
        int prev = 0;
        int temp = -1;
        int flag=-1;
        for(int i=size-1; i>=0; i--){
            int num = a.get(i);
            if(num < prev){
                for(int j=i+1; j<size; j++){
                    if(num < a.get(j)){
                        temp = a.get(j);
                        if(j==size-1){
                            a.set(j, num);
                             a.set(i, temp);
                            if(i==size-2){
                             
                            }else{
                                for(int k=i+1;k<size-1;k++){
                            int knum = a.get(k);
                            int inner = k;
                            for(int l=k+1; l<size; l++){
                               if(knum > a.get(l)){
                                   knum = a.get(l);
                                   inner = l;
                               } 
                            }
                            int innerTemp = a.get(k);
                            a.set(k, knum);
                            a.set(inner, innerTemp);
                        }
                            }
                        flag = 0;
                        break;
                        }
                    }else{
                        a.set(j-1, num);
                        a.set(i, temp);
                        
                        for(int k=i+1;k<size-1;k++){
                            int knum = a.get(k);
                            int inner = k;
                            for(int l=k+1; l<size; l++){
                               if(knum > a.get(l)){
                                   knum = a.get(l);
                                   inner = l;
                               } 
                            }
                            int innerTemp = a.get(k);
                            a.set(k, knum);
                            a.set(inner, innerTemp);
                        }
                        flag=0;
                        break;
                    }
                }
                if(flag == 0){
                break;
                }
            }
            prev = num;
        }
        if(flag==-1){
            Collections.sort(a);
        }
    }
}

