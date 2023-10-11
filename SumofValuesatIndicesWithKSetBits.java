class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        

        ArrayList<String> bin = new ArrayList<String>();
        int sum =0;

        for( int i=0; i< nums.size(); i++){
            String itr= Integer.toBinaryString(i);
            bin.add(itr);
        }
        

        for(int i=0; i< bin.size(); i++){
            System.out.println(sum);
            int count=0;
            
            for( int j=0; j< bin.get(i).length(); j++){
                if(bin.get(i).charAt(j)=='1'){
                    count++;
                }
            }
            if(count ==k){sum +=nums.get(i);}
            
        }

        

    return sum;
    }
}
