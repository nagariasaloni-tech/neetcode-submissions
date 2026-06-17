class Solution {
    public int rob(int[] nums) {
        
        return Math.max(nums[0],
        Math.max(robHelper(nums,0,nums.length-1),robHelper(nums,1,nums.length)));
        
    }
    public int robHelper(int[] nums,int start,int end) {
        int prev1 =0;
        int prev2 =0;

        for(int i=start;i<end;i++){
            int curr = Math.max(prev2, prev1+nums[i]);
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}
