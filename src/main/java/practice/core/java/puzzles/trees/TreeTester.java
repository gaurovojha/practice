package practice.core.java.puzzles.trees;

public class TreeTester {

    public static void main(String[] args) {



        BinarySearchTree binarySearchTree = new BinarySearchTree(40);
        System.out.println(binarySearchTree.getRoot().getData());

        binarySearchTree.insert(10);

    }
}
