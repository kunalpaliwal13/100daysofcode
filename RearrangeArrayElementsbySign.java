class Solution {
    public void putInt(int[] ans, int ind, int i, int j){
        if(ind<0){ans[j]= ind; j=j+2;}
        if(ind>=0){ans[i]= ind; i=i+2;}
    }
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int i=0; int j=1;
        int[] ans = new int[len];
        int ind =0;
        while(ind !=nums.length){
            if(j<len){if(nums[ind]<0){ans[j]= nums[ind]; j=j+2; ind++; continue;}}
            if(i<len){if(nums[ind]>=0){ans[i]= nums[ind]; i=i+2;}}
            ind++;
        }
        return ans;
        
        
    }
}
