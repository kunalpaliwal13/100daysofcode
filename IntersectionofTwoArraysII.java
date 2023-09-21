class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        //sorting the arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len1= nums1.length;
        int len2= nums2.length;

        //defining nums in array and a new arraylist for result 
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //length pointers
        int i= 0;   //for nums1
        int j=0;    //for nums 2

        //dependencies end -----------------------------------

        //solution 
        while(i< len1 && j< len2){
            if(nums1[i]!= nums2[j]){
                if(nums1[i]>nums2[j]){j++;}
                else{i++;}
            }
            else{arr.add(nums1[i]); i++; j++;}
        }

        //ArrayList to array
        int[] res= new int[arr.size()];
        for( int k =0; k< arr.size(); k++){
            res[k]= arr.get(k);
        }

        return res;

    }
}
