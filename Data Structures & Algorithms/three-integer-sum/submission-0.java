class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length;i++){
            int target = -nums[i];
            int p1 = i+1;
            int p2 = nums.length-1;
            while(p1<p2){
                int target2 = nums[p1]+nums[p2];
                if(target2>target)
                    p2--;
                else if(target2<target)
                    p1++;
                else {
                    result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p1++;
                    p2--;
                }

            }

        }
        return new ArrayList<>(result);
    }
}
