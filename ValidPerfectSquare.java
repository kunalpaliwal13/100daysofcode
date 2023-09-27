class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1){return true;}
        long start=0;
        long end = num/2+2;
        long mid=0;
        while(start<end){
            mid= start+(end-start)/2;
            long res= mid*mid;
            if(res<num){
                start=mid;
                continue;
            }
            else if(res==num){
                return true;
            }
            else if(res>num){
              while(res>num){
                mid--;
                res= mid*mid;}
            }
            if(res<num){return false;}
            if(res==num){return true;}
            
            
        }  
        return false;
        
    }
}
