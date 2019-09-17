class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> left = new ArrayList();
        List<Integer> right = new ArrayList();
        
        int lastNum = label;
        int factor =1;
        int stage = 0;
        int num=1;
        left.add(1);
        right.add(1);
        
        while(true){
            if(lastNum>=factor){
                lastNum= lastNum-factor;
                stage++;
                
                if(num>1){
                    if(stage%2==0){
                        right.add((num-factor)+1);
                        left.add(num);
                        
                    }else{
                        left.add((num-factor)+1);
                        right.add(num);
                    }
                }
                factor=2*factor;
                num=num+factor;
                
            }else{
                break;
            }
        }
        if(lastNum>0){
            if(stage%2!=0){
               if((factor/2)>=lastNum){
                   right.add(label);
                    return right;
               }else{
                   left.add(label);
                    return left;
               }
            }else{
                if((factor/2)>=lastNum){
                   left.add(label);
                    return left;
               }else{
                   right.add(label);
                    return right;
               }
            }
        }else{
            if(stage%2==0){
                return left;
            }else{
                return right;
            }
        }
    }
}

