package OP_BT1;

import java.util.Stack;

public class BTS {
    TreeNode root;

    public BTS(){
        root = null;
    }

    public void postorderTraversal(){
        if (root == null){
            System.out.println("BST is empty");
            return;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            stack2.push(node);

            if (node.left != null)
                stack1.push(node.left);

            if (node.right != null)
                stack1.push(node.right);
        }
        System.out.println("Post-order traversal:");
        while (!stack2.isEmpty()){
            TreeNode node = stack2.pop();
            System.out.println(node.val + " ");
        }
        System.out.println();
    }
    public void insert(int val){
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val){
        if (root == null){
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);

        return root;
        }
    }
