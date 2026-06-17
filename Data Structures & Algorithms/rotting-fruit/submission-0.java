class Solution {
    int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int fresh = 0;
    private int time = 0;
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1)
                    fresh++;
                if (grid[r][c] == 2) {
                    queue.offer(new int[] {r, c});
                }
            }
        }
        while (fresh > 0 && !queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                for (int[] dir : direction) {
                    int r = curr[0] + dir[0];
                    int c = curr[1] + dir[1];
                    if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 1) {
                    grid[r][c] = 2;
                    fresh--;
                    queue.offer(new int[] {r,c});
                }
                }
                
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}