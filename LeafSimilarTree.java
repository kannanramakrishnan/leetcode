class LeafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        checkLeaves(root1, leaves1);
        checkLeaves(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private void checkLeaves(TreeNode root, List<Integer> leaves) {
        if(root == null)
            return;

        if(root.left == null && root.right == null){
            leaves.add(root.val);
        }

        checkLeaves(root.left, leaves);
        checkLeaves(root.right, leaves);
    }
}
