class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},{0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int island=0;
        for(int r = 0; r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c] == '1'){
                    bfs(grid,r,c);
                    island++;
                }
            }   
        }
        return island;   
    }
    private void bfs(char[][] grid, int r, int c){
        Queue<int[]> queue = new LinkedList<>();
        grid[r][c]='0';
        queue.add(new int[]{r,c});

        while(!queue.isEmpty()){
            int[] node = queue.poll();
            int row = node[0];
            int col = node[1];
            for(int[] dir:directions){
                int nrow = row+dir[0];
                int ncol = col+dir[1];

                if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length
                && grid[nrow][ncol]=='1'){
                    queue.add(new int[]{nrow,ncol});
                    grid[nrow][ncol]='0';
                }
            }
        }
    }
}
