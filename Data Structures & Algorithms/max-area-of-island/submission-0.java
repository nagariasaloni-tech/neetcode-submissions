class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},{0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        for(int r = 0; r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c] == 1){
                    area = Math.max(area,bfs(grid,r,c));
                    
                }
            }   
        }
        return area;
    }

        private int bfs(int[][] grid, int r, int c){
        int area = 0 ;
        Queue<int[]> queue = new LinkedList<>();
        grid[r][c]=0;
        queue.add(new int[]{r,c});

        while(!queue.isEmpty()){
            area++;
            int[] node = queue.poll();
            int row = node[0];
            int col = node[1];
            for(int[] dir:directions){
                int nrow = row+dir[0];
                int ncol = col+dir[1];

                if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length
                && grid[nrow][ncol]==1){
                    queue.add(new int[]{nrow,ncol});
                    grid[nrow][ncol]=0;
                }
            }
        }
        return area;
    }
}
