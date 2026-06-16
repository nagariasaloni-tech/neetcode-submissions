class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1;

        while(p1<p2){
            int sum = numbers[p1]+numbers[p2];
            if( sum > target)
            {
                System.out.println("> "+numbers[p1]+" "+numbers[p2]);
                p2--;
            }
                
            else if(sum < target)
            {
                System.out.println("< "+numbers[p1]+" "+numbers[p2]);
                 p1++;
            }
               
            else 
            {
                System.out.println("= "+numbers[p1]+" "+numbers[p2]);
                return new int[]{p1+1,p2+1};
            }
                
        }
        return new int[]{};
    }
}
