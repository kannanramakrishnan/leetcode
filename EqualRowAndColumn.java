class EqualRowAndColumn {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>, Integer> map1 = new HashMap<>();
        int n = grid.length;

        for(int i=0; i<n; i++) {
            List<Integer> li = new ArrayList<>();
            for(int j=0; j<n; j++) {
                li.add(grid[i][j]);
            }

            map1.put(li, map1.getOrDefault(li,0)+1);
        }

        int count = 0;
        
        for(int i=0; i<n; i++) {
            List<Integer> li = new ArrayList<>();
            for(int j=0; j<n; j++) {
                li.add(grid[j][i]);
            }

            if(map1.containsKey(li)) {
                count+=map1.get(li);
            }
        }
        return count;
    }
}
