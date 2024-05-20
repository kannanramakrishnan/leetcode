class BinaryTreeRightSide {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        help(root,0,list);
        return list;
    }
    public static void help(TreeNode root,int level,List<Integer> list ){
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root.val);
        }
        help(root.right, level+1,list);
        help(root.left,level+1,list);
    }
}
