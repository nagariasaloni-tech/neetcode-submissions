class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n =temperatures.length;
        Stack<Integer> helperStack = new Stack<>();
        int[] res = new int[n];

        for(int index = n-1 ; index>=0;index--){

            while(!helperStack.isEmpty() && 
               temperatures[index]>=temperatures[helperStack.peek()])
               {
                helperStack.pop();
               }

            if(!helperStack.isEmpty())
                res[index] = helperStack.peek()-index;

            helperStack.push(index);
        }

         return res;   
    }
}
