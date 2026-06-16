class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<high){;
            
             int mid = low + (high - low)/2;
             if(nums[high] > nums[mid])
                high = mid;
             else
                low = mid+1;
        }

        int minValueIndex = low;
        int index = binarySearch(nums,target,minValueIndex,nums.length-1);

        if(index != -1)
            return index;

        return binarySearch(nums,target,0,minValueIndex-1);

    }

    public int binarySearch(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = (high+low)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid+1; 
        }
        return -1;
    }
}
