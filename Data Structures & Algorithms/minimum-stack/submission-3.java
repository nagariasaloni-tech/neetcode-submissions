class MinStack {
        long min;
        Stack<Long> minStack;
    public MinStack() {
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty()){
            min = val;
            minStack.push((long)val);
        }
        else if(val>min)
                minStack.push((long)val);
        else{
                minStack.push(2L*val-min);
                min = val;
            }
    }
    
    public void pop() {
        if(minStack.isEmpty())
            return;
        else{
            long top = minStack.peek();
            minStack.pop();
            if(top < min)
                min = 2L*min - top;
        }
            
        
    }
    
    public int top() {
        if(minStack.isEmpty())
            return 0;
        long top = minStack.peek();
         if(top > min)
            return (int)top;
        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}
