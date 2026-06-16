class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operation = new Stack<>();
        

        for(String token:tokens){
           if(token.equals("+"))
                operation.push(operation.pop() + operation.pop());
            else if(token.equals("-"))
            {
                int a = operation.pop();
                int b = operation.pop();
                operation.push(b-a);
            }
            else if(token.equals("*"))
            {
                int a = operation.pop();
                int b = operation.pop();
                operation.push(b*a);
            }
            else if(token.equals("/"))
            {
                int a = operation.pop();
                int b = operation.pop();
                operation.push(b/a);
            }
            else
                operation.push(Integer.parseInt(token));
        }
        return operation.pop();
    }
}
