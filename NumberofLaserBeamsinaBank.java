class Solution {
    public int checkRow(int prev, String[] arr, int res, int ind){
        if(ind == arr.length){return 0;}
        int thisRow =0;
        String temp = arr[ind++];
        for( int i=0; i< temp.length(); i++){
            if(temp.charAt(i)=='1'){
                thisRow++;
            }
        }
        if(thisRow==0){return checkRow(prev, arr , res, ind) +res;}
        else{res=thisRow*prev; return checkRow(thisRow, arr, 0, ind )+res;}
        }
    public int numberOfBeams(String[] bank) {
        int res=0;
        res = checkRow(0, bank, res, 0);
        return res;
        
    }
}
