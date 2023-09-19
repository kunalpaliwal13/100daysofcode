class Solution {
    public int countNegatives(int[][] grid) {
        int col = grid[0].length-1;
        int count =0;
        for( int i=0; i< grid.length; i++){
            int left =0; 
            int right =col;
            while(left<=right){ 
                int mid=left+(right-left)/2;
                
                if(grid[i][mid]<0){

                    if(mid==0){count+=col+1; break;}// 0th index is negative 
                    
                    else if(grid[i][mid-1]>=0 && mid!=0){
                        count+=col-mid+1;
                        break;
                    }
                    else{right = mid-1;}
                }
                else if(grid[i][mid]>=0){left= mid+1;}
                

            }

        }
        return count;
    }
}
