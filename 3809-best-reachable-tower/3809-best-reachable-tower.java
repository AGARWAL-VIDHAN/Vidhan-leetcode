class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int x = 0;
        int y = 0;
        int[][] ReachableTower = new int[towers.length][3];
        for (int i = 0; i < towers.length; i++) {
            int distance = 0;
            for (int j = 0; j < 2; j++) {
                x = towers[i][j] - center[j];
                if (x < 0) {
                    x = -x;
                }
                distance += x;
            }
            if (distance <= radius) {
                ReachableTower[y] = towers[i];
                y++;
            }
        }
        int[] ans = new int[2];
        if (y ==0) {
            ans[0] = -1;
            ans[1] = -1;
        } else {
            int max = 0;
            int k = 0;
            for (int i = 0; i < towers.length; i++) {
                if (max < ReachableTower[i][2]|| (ReachableTower[i][2]==max && (ReachableTower[i][0]<ReachableTower[k][0] || (ReachableTower[i][0]==ReachableTower[k][0]&& (ReachableTower[i][1]<ReachableTower[k][1]))))) {
                    max = ReachableTower[i][2];
                    k=i;
                }
            }
            ans[0] = ReachableTower[k][0];
            ans[1] = ReachableTower[k][1];
        }
        return ans;
    }
}