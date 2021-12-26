package practice.core.gaurov.problems.hackerrank.gfg;

public class CheckForBST {




}

class BST{
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public BST() {
        this.root = null;
    }

    void insert(int value){
        insert(root , value);
        //System.out.println(root.data);
    }

    public TreeNode insert(TreeNode root, int value){

        if(root == null){
            root = new TreeNode(value);
            return root;
        }

        System.out.println(root.data);
        if(root.data > value){
            //add to left subtree
            root.left = insert(root.left, value);
        }
        else{
            //add to right subtree
            root.right = insert(root.right, value);
        }

        return root;
    }

    /**
     * LNR
     * @param root
     */
    public void inOrderTraversal(TreeNode root){
        if(root == null) return;

        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);

    }

}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Demo{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert( 50);
        System.out.println("*********");
        bst.insert( 30);
        System.out.println("*********");
        bst.insert(20);
        System.out.println("*********");
        bst.insert(40);
        System.out.println("*********");
        bst.insert(70);
        System.out.println("*********");
        bst.insert(60);
        System.out.println("*********");
        bst.insert(80);
        System.out.println("*********");

        //bst.inOrderTraversal(bst.getRoot());
    }
}