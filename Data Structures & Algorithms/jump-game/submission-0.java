class Solution {
    public boolean canJump(int[] nums) {
        int current = nums.length-1;

        for(int i = nums.length-2;i>=0;i--){
            if(nums[i] + i >= current){
                current = i;
            }
        }
        return current == 0;
    }
}
