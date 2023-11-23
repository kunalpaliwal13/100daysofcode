import java.util.Stack;
class MyQueue {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public MyQueue() {
        
        
    }
    
    public void push(int x) {
        if(first.isEmpty()==true && second.isEmpty()==false){
            while(!second.isEmpty()){
                first.push(second.pop());
            }
        }
        first.push(x);
        
    }
    
    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int res= second.pop();
        return res;
    }
    
    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int res = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return res;

        
    }
    
    public boolean empty() {
        return (second.isEmpty()&& first.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
