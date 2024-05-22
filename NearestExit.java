class NearestExit {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        boolean [][] v = new boolean[m][n];

        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);

        int[][] dr={{0,1},{0,-1},{1,0},{-1,0}};
        v[entrance[0]][entrance[1]]=true;
        int steps=0;

        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                int[] cc = q.poll();
                int r = cc[0];
                int c = cc[1];

                if((r!=entrance[0] || c!=entrance[1]) && (r==0 || c==0 ||c==n-1|| r==m-1)){
                    return steps;
                }

                for(int[]d: dr){
                    int nr=r+d[0];
                    int nc = c+d[1];
                    if(nr >=0 && nr<m && nc>=0 && nc < n && maze[nr][nc]!='+' && !v[nr][nc]){
                        q.offer(new int[]{nr,nc});
                        v[nr][nc]=true;
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
