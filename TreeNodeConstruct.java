public class TreeNodeConstruct {
    public static void main(String[] args) {
        TreeNode leftTree1=new TreeNode(5);
        TreeNode rightTree1=new TreeNode(6);
        TreeNode root1=new TreeNode(4,leftTree1,rightTree1);
        TreeNode leftTree2=new TreeNode(2);
        TreeNode rightTree2=new TreeNode(3);
        TreeNode root2=new TreeNode(1,leftTree2,rightTree2);
        TreeNode root=new TreeNode(0,root2,root1);
        leftorder(root);
        System.out.println("*************************");
        rightorder(root);
    }

    public static void leftorder(TreeNode root){
//        if(root!=null){
//            System.out.println(root.val);
//            if(root.left!=null) {
//                System.out.println(root.left.val);
//            }
//            if(root.right!=null) {
//                System.out.println(root.right.val);
//            }
//            leftorder(root.left);
//        }

        if(root.left!=null){
            System.out.println(root.left.val);
            leftorder(root.left);
        }
    }

    public static void rightorder(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            if(root.left!=null) {
                System.out.println(root.left.val);
            }
            if(root.right!=null) {
                System.out.println(root.right.val);
            }
            rightorder(root.right);
        }
    }

}
