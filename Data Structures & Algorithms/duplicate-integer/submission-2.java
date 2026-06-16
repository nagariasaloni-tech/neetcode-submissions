class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> frequency = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(frequency.contains(nums[i]))
                return true;
            frequency.add(nums[i]);
        }
        return false;
    }
}