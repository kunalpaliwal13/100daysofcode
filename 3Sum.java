class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<HashSet<Integer>> arr = new HashSet<>();

         
        ;
        boolean a= true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
               a =  false; 
            }
        }
        if(a== true){
            HashSet<Integer> innerSet = new HashSet<>();
            innerSet.add(0);
            innerSet.add(0);
            innerSet.add(0);
            List<List<Integer>> twoDList = new ArrayList<>();

        for (HashSet<Integer> set : arr) {
            List<Integer> list = new ArrayList<>(set);
            twoDList.add(list);
        }
        return twoDList;
        }
        int n=0;
        Arrays.sort(nums);
        int right= nums.length-1;
        for(int i=0; i< nums.length-2; i++){
            int left= i+1;
            
            
            int sum = nums[i]+ nums[left]+ nums[right];
            if(sum==0){
                arr.add(new HashSet<>(3));
                innerSet.add(nums[i]);
                innerSet.add(nums[left]);
                innerSet.add(nums[right]);
                arr.add(innerSet);
                n++;
                i--;
                right--;
    
            }
            else if(sum>0){
                right--;
            }
            else {
                continue;
            }
        }
        List<List<Integer>> twoDList = new ArrayList<>();

        for (HashSet<Integer> set : arr) {
            List<Integer> list = new ArrayList<>(set);
            twoDList.add(list);
        }
        return twoDList;
    }
}
