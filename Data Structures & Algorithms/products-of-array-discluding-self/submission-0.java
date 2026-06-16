class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zerocount = 0;
        int[] res = new int[nums.length];
        for(int num:nums)
        {
            if(num != 0)
                product = product*num;
            else
                zerocount++;
        }
        if(zerocount>1)
            return new int[nums.length];
            

        for(int i = 0;i<nums.length;i++)
        {
            if(zerocount > 0)
                res[i] = (nums[i]==0) ? product : 0;
            else
                res[i] = product/nums[i];
        }
            
        
        return res;
    }
}  
