class UniquePaths {
    public int unique(int x, int y, int m, int n, int[][] dp){
        if(dp[x][y]!=-1) return dp[x][y];
        if(x==m-1 && y==n-1) return 1;
        if(x>m-1 || y>n-1) return 0;
       dp[x][y]=unique(x+1, y, m, n, dp) + unique(x, y+1, m, n, dp);
        return dp[x][y];
    }
    public int uniquePaths(int m, int n) {
     int[][] dp=new int[m+1][n+1];
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              dp[i][j]=-1;
          }
      }
        return unique(0, 0, m, n, dp);
    }
}
