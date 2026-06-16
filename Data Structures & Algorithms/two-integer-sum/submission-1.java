class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int sum = target-nums[i];
            if(freq.containsKey(sum))
                return new int[]{freq.get(sum),i};
            freq.put(nums[i],i);
        }
        return new int[]{};
    }
}
