class Solution {
    public int findChampion(int[][] grid) {
        int champ=0;
        int champcount=0;
        for( int i=0; i<grid[0].length; i++){
            for( int j=0; j< grid[0].length; j++){
                if(i==j){continue;}
                else{
                    if(grid[i][j]==1){if(i==champ){champcount++;}else{champ =i;champcount=1;}}
                }
                if(champcount==grid[0].length-1){return champ;}
            }
            
        }
        return champ;
    }
}
