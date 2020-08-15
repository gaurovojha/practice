package practice.core.java.puzzles.trees;

public class BinarySearchTree {

    private BinaryTreeNode root;

    public BinarySearchTree(int data) {
        this.root = new BinaryTreeNode(data);
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public BinaryTreeNode getBinaryTree(int data){
        return this.root;

    }

    public BinaryTreeNode insert(int data){
        return insertRec(root, data);
    }

    public BinaryTreeNode insertRec(BinaryTreeNode node , int data){
        if(node==null){
            return new BinaryTreeNode(data);
        }
        if(data<node.getData()){
            node.setLeft(insertRec(root.getLeft(),data));
        }else{
            node.setRight(insertRec(root.getRight(),data));
        }
        return root;
    }

    public void deleteNode(){
    }

    public void searchNode(){
    }

    @Override
    public String toString() {
        //root
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
