package practice.core.leetcode.amazon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
/*
    public List<List<Integer>> levelOrder1(TreeNode root){

    }*/

    public void levelHelper1(List<List<Integer>> result, TreeNode root, int height){
        // res is a 2 d array
        if(root==null) return;
        if(height >= result.size()){
            result.add(new ArrayList<>());
        }
        result.get(height).add(root.val);
        levelHelper1(result, root.left, height+1);
        levelHelper1(result, root.right, height+1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0);
        return res;
    }

    public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }
        res.get(height).add(root.val);
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
    }

    
//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

}
