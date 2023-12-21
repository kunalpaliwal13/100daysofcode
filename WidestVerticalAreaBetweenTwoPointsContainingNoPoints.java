class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] temp =new int[points.length];

        int left = 0; 
        int right = points.length-1;
        while(left<=right){
            temp[left]= points[left][0];
            temp[right]= points[right][0];
            left++;
            right--;
        }
        Arrays.sort(temp);
        int max =0;
        for( int i=0; i< points.length-1; i++){
            int c = temp[i+1]-temp[i];
            if(c>max){max =c; }
        }
        return max;
    }
}
