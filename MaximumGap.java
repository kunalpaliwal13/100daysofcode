class Solution {
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if(len<2){return 0;}
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int max =0;
        while(j<nums.length){
            int diff= nums[j]- nums[i];
            if(diff >max){max =diff;}
            i++; 
            j++;
            
        }
        return max;
    }
}
