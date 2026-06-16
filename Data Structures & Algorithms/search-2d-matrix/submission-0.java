class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowId = findPotentialRow(matrix,target);
        System.out.println(rowId);
        if(rowId != -1) 
            return findElement(rowId,matrix,target);
        else return false;
    }

    public int findPotentialRow(int[][] matrix, int target)
    {
        int low =0;
        int high = matrix.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            System.out.println(mid+" "+matrix[mid][0] + " " + matrix[mid][matrix[0].length-1]);

            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length-1] >= target)
                return mid;
            else if(matrix[mid][0] < target)
                low = mid+1;
            else if(matrix[mid][0] > target)
                high = mid-1;
        }

        return -1;
    }

    public boolean findElement(int rowId,int[][] matrix, int target)
    {
        int low =0;
        int high = matrix[rowId].length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(target == matrix[rowId][mid] )
                return true;
            else if(matrix[rowId][mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }

        return false;
    }
}
