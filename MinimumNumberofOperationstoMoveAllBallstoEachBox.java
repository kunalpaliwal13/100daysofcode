class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] ans = new int[len];
     for( int i=0; i< len; i++){
         int count =0;
         for(int j=0; j<len; j++){
             if( i==j){continue;}
             else{if(boxes.charAt(j)=='1'){count= count+Math.abs(j-i);}}
         }
         ans[i]= count;
     }   
     return ans;
    }
}
