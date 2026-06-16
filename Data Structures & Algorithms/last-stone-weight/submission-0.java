class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones)
            maxHeap.add(stone);
        
        while(maxHeap.size()>1){
            int stone1= maxHeap.poll();
            int stone2 = maxHeap.poll();
            int val = stone1 - stone2;
            maxHeap.add(val);
        }

        return maxHeap.peek();
    }
}
