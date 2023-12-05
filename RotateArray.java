class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){k= k%nums.length;}
        int ind = nums.length-k;
        ArrayList<Integer> arr = new ArrayList<>();
        for( int i=ind; i< nums.length; i++){
            arr.add(nums[i]);
        }
        for( int i=0;i< ind; i++){
            arr.add(nums[i]);
        }
        
 
        for (int i = 0; i < arr.size(); i++){
            nums[i] = arr.get(i);}


    }
}
