class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> arr= new ArrayList<Integer>(); 
        int start=-1;
        int end=0;
        Arrays.sort(nums);
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int temp = nums[mid];
            if(temp==target){start= mid; right = mid-1;}
            if(temp<target){left= mid+1;}
            if(temp>target){right= mid-1;}
        }
        left =0;
        right = nums.length-1;
        while(left<=right){
            
            int mid = left+(right-left)/2;
            int temp = nums[mid];
            if(temp==target){end= mid;left = mid+1;}
            if(temp<target){left= mid+1;}
            if(temp>target){right= mid-1;}
        }
        if(start==-1){return arr;}
        for( int i=start; i<= end; i++){
            arr.add(i);
        }
        
        return arr;
    }
}
