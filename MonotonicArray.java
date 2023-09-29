class Solution {
    public static boolean monotonicIncrease(int[] arr){
        for( int i=0; i< arr.length-1; i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean monotonicDecrease(int[] arr){
        for( int i=1; i< arr.length; i++){
            if(arr[i-1]<arr[i]){
                return false;
            }
        }
        return true;
    }

    public boolean isMonotonic(int[] nums) {
        if(monotonicIncrease(nums)==true || monotonicDecrease(nums)== true){
            return true;
        }
        return false;
    }
}
