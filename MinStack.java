class MinStack {
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> min = new ArrayList<>();


    public MinStack() {
        
    }
    
    public void push(int val) {
        if(arr== null){
            min.add(val);
            arr.add(val);
        }else{
        arr.add(val);
        if(min.size()==0 || val<=min.get(min.size()-1)){min.add(val);}
        }
        
    }
    
    public void pop() {
        int size= min.size()-1;
        if((arr.get(arr.size()-1)).equals(min.get(size))){min.remove(size);}
        arr.remove(arr.size()-1);
        
    }
    
    public int top() {
        return arr.get(arr.size()-1);
        
    }
    
    public int getMin() {
        if(min.size()==0){return arr.get(0);}
        return min.get(min.size()-1);
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
