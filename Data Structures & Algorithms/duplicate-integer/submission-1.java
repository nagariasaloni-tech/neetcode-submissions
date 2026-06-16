class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> freq = new HashSet<>();
        for (int num : nums) {
            if (freq.contains(num))
                return true;
            else
                freq.add(num);
        }
        return false;
    }
}