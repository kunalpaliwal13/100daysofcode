class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right= numbers.length-1;
        int[] res= new int[2]; 
        
        while(left<right){

            int su=numbers[left]+ numbers[right];
            if(su==target){
                res[0]= left+1;
                res[1]= right+1;
                return res;
            }
            else if(su<target){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
