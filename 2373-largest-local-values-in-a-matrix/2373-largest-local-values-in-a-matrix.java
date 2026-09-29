class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] answer = new int[n - 2][n - 2];
        int max = 0;
        for (int x = 0; x < n - 2; x++) {
            for (int y = 0; y < n - 2; y++) {
                max = 0;
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        if (max < grid[i][j]) {
                            max = grid[i][j];
                        }
                    }
                }
                answer[x][y]=max;
            }
        }
        return answer;
    }
}
