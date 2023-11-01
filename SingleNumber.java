class Solution {
    public int singleNumber(int[] nums) {
        int j=nums.length-1;
        Arrays.sort(nums);
        for( int i=0; i< (nums.length-1)/2; i=i+2){
            if(nums[i]!= nums[i+1]){return nums[i];}
            if(nums[j]!=nums[j-1]){return nums[j];}
            j=j-2;
        }
        return nums[nums.length-1];
    }
}
