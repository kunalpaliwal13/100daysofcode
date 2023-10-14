class Solution {
    public void rotate(int[][] matrix) {
        int colLen = matrix[0].length-1;
        int rowLen = matrix.length-1;
        //case 1 rowLen = 3, colLen =3

        for( int  i=0; i<= rowLen; i++){
            for( int j=0; j<= colLen; j++){
                if(i<j){continue;}
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;

            }
        }
        
        for( int i=0; i<= colLen; i++){
            
            for( int j=0; j<= rowLen/2; j++){
                if(j==rowLen/2 && rowLen%2 ==0){break;}
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][colLen-j];
                matrix[i][colLen-j]= temp;
            }
        }

       
    }
}
