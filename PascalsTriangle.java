class Solution {
    public void Add(int num, List<Integer> arr2, List<List<Integer>> ans){
        if(num==0){return;}

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for( int i=0; i< arr2.size()-1; i++){
            arr.add(arr2.get(i)+ arr2.get(i+1));
        }
        arr.add(1);
        num--;
        ans.add(arr);
        Add(num, arr, ans);
        return ;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        one.add(1);
        ans.add(one);
        // two.add(1);
        // two.add(1);
        // ans.add(two);
        Add(numRows-1,  one, ans);
        return ans;
    }
}
