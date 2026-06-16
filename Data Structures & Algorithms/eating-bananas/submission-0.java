class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed =1;
        int maxSpeed = Arrays.stream(piles).max().getAsInt();

        while(minSpeed < maxSpeed){
            int mid = ((maxSpeed-minSpeed)/2 ) + minSpeed;
            int totalhours = 0;
            for(int i =0;i<piles.length;i++)
                totalhours +=(int)Math.ceil((double)piles[i]/mid);

            if(totalhours > h)
                minSpeed = mid+1;
            else if(totalhours <= h)
                maxSpeed = mid;
        }
        return minSpeed;
    }
}
