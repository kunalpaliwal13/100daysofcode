import java.util.Arrays;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> arr_low= new ArrayList<Integer>();
        ArrayList<Integer> arr_high= new ArrayList<Integer>();
        int len = nums.length;

       for( int i=0; i< len; i++){
           if(nums[i]<pivot){arr_low.add(nums[i]);}
       }
       for( int i=0; i< len; i++){
           if(nums[i]==pivot){arr.add(nums[i]);}
       }
       for( int i=0; i< len; i++){
           if(nums[i]>pivot){arr.add(nums[i]);}
       }
       for(int i=0; i<len; i++){
           nums[i]= arr.get(i);
       }
       return nums;
    }
}
