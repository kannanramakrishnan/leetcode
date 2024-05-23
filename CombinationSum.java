class CombinationSum {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        foo(res, k, n, 1, new ArrayList<>());
        return res;
    }
    private void foo(List<List<Integer>> res, int k, int n, int i, List<Integer> cur){
        if(n == 0 && k == 0){
            res.add(new ArrayList<>(cur));
        }
        if(i > n || k == 0 || i == 10){
            return;
        }

        // with i
        cur.add(i);
        foo(res, k - 1, n - i, i + 1, cur);
        cur.remove(cur.size() - 1);

        // without i
        foo(res, k, n, i + 1, cur);
    }
}
