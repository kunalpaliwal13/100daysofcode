class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> arr= new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0; i< nums1.length; i++){
            int target = nums1[i];
            int left =0; 
            int right = nums2.length-1;
            
            while(left<=right){
                int mid = left+(right-left)/2;
                int ele= nums2[mid];
                if(ele == target){arr.add(target); break;}
                else if(ele<target){left=mid+1;}
                else{right = mid-1;}
            }
            
        }
        int[] res= new int[arr.size()]; 
        int i=0;
        for( Integer ele: arr){
            res[i]= ele;
            i++;
        }
        return res;
    }

}
