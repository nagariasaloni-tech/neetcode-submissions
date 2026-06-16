class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character bracket:s.toCharArray()){
            if(bracket == '(' || bracket == '{' || bracket == '[')
                stack.push(bracket);
            else if(!stack.isEmpty() && ((stack.peek() == '(' && bracket == ')') ||
                 (stack.peek() == '{' && bracket == '}') ||
                 (stack.peek() == '[' && bracket == ']')) )
                    stack.pop();
            else
                return false;  
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
