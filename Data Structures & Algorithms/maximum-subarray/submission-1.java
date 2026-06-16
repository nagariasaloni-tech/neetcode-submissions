class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i=0; i<n;i++){
            int prevsum=0;
            for(int j = i; j<n; j++)
            {
                prevsum = prevsum+nums[j];
                max = Math.max(max,prevsum);
            }
            
        }
        return max;
    }
}
