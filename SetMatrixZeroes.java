class Solution {
    public void setColZero(int [][] matrix, int j){
        for( int i=0; i< matrix.length; i++){
            matrix[i][j]=0;
        }
    }
    public void ReplaceArr(int[][] matrix, int[] replacement, int i){
        matrix[i]= replacement;
    }
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix[0].length;
        int[] zeros=new int[rowLen];
        for( int i =0; i< zeros.length; i++){
            zeros[i]=0;
        }
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for( int i=0; i< matrix.length; i++){
            for( int j=0; j< rowLen; j++){
                if(matrix[i][j]==0){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for(int i=0; i< x.size(); i++){
            ReplaceArr(matrix, zeros, x.get(i));
        }
        for( int i=0; i< y.size(); i++){
            setColZero(matrix, y.get(i));
        }
        
    }
}
