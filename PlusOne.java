class Solution {
    
    public int[] plusOne(int[] digits) {
        int len = digits.length-1;
        int sum = digits[len]+1;
        int count =0;
        if(sum <10){digits[len]=sum; return digits;}
        else{
            digits[len]= sum%10;
            count =sum/10;
            int i =len-1;
            while(count !=0){
                if(i<0){
                    int[] arr= new int[digits.length+1];
                    arr[0]= 1;
                    int k=1;
                    for( int j=0; j< digits.length; j++){
                        arr[k]= digits[j];
                        k++;
                    }
                    return arr;
                }
                sum = digits[i]+count;
                if(sum >9){
                    count = sum/10;
                    digits[i]= sum%10;
                    i--;
                }
                else{
                    digits[i]= digits[i]+ count;
                    count =0;
                }
            }
        }


       
        return digits;
    }
}
