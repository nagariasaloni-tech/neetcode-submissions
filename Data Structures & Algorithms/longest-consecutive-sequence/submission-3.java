class Solution {
    public int longestConsecutive(int[] nums) {
        int result =0;
        Set<Integer> numSet = new HashSet<>();
        for(Integer num:nums){
            numSet.add(num);
        }

        for(Integer num:numSet){
            int length =1;
            while(numSet.contains(num+length))
                length++;
            
            result = Math.max(length,result);
        }
        return result;
    }
}
