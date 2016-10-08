package practice.core;

/*
 * boolean mirrorImages(root1, root2)
 *
 * base condition  : no nodes left for traversal
 * 
 * if(root1==null && root2==null) 
 * return true
 *
 * if(root1==root2){
 * if(mirrorImages(root1.left, root2.right) && mirrorImages(root1.right, root2.left))
 * return true
 * }
 * 
 * 
 * USING WHILE LOOP
 * 
 * while(!root1==null && !root2==null){
 * if(compare(root1.left,root2.right) ||
 * compare(root1.right ,root2.left)){
 * root1= root1.left;
 * root2= root2.right;
 * flag = true;
 * }
 * else
 * flag = false
 * }
 * if(flag) print("mirror images");
 * else print(" NOT mirror images");
 * 
 * 
 * compare(node1, node2){
 * if(node1.data==node2.data)
 * return true
 * else
 * return false
 * 
 * }
 * 
 */
public class BinrayTreeMirrorImages {

}
