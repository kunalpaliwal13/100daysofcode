class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length/4;
        for( int i=0; i< arr.length-len; i++){
            if(arr[i]== arr[i+len]){return arr[i];}
        }
        return arr[0];
       
    }
}
