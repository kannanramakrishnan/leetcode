class CountGoodNodes {
    int res = 0;
    public int goodNodes(TreeNode root) {
        traverse(root, Integer.MIN_VALUE);
        return res;
    }

    private void traverse(TreeNode node, int max){
        if(node == null)
        return;

        if(node.val >= max){
            max=node.val;
            res++;
        }

        traverse(node.left, max);
        traverse(node.right, max);
    }
}
