class ZigZagPath {
    int length = 0;
    public int longestZigZag(TreeNode root) {
        getlongest(root, 0, 0);
        return length;
    }

    private void getlongest(TreeNode root, int left, int right){
        if(root == null){
            return;
        }
        length = Math.max(length, Math.max(left, right));
        if(root.left != null){
            getlongest(root.left, right+1, 0);
        }
        
        if(root.right != null) {
            getlongest(root.right, 0, left+1);
        }
    }
}
