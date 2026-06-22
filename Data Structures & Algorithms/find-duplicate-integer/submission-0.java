class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(Integer num:nums){
            if(!set.add(num))
                return num;
        }
        return 0;
    }
}
