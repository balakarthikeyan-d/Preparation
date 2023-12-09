public class TreeNodeConstruct {
    public static void main(String[] args) {
        TreeNode leftTree1=new TreeNode(5);
        TreeNode rightTree1=new TreeNode(6);
        TreeNode root1=new TreeNode(4,leftTree1,rightTree1);
        TreeNode leftTree2=new TreeNode(2);
        TreeNode rightTree2=new TreeNode(3);
        TreeNode root2=new TreeNode(1,leftTree2,rightTree2);
        TreeNode root=new TreeNode(0,root2,root1);
        System.out.println(treeConstruct(root));
    }
    public static String treeConstruct(TreeNode node) {
        String left = "";
        String right = "";
        String output = "";

        if(node.left!=null) {
            left = treeConstruct(node.left);
        }
        if(node.right!=null) {
            right = treeConstruct(node.right);
        }

        if(left!="") {

            if(right!="") {
                output = node.val+"("+left+")"+"("+right+")";
            }
            else {
                output = node.val+"("+left+")";
            }
        }
        else {
            if(right!="") {
                output = node.val+"()"+"("+right+")";
            }
            else {
                output = Integer.toString(node.val);
            }
        }
        return output;
    }
}
