package OP_BT2;

public class BST {
    TreeNode root;

    public BST() {
        root = null;
    }

    // Hàm thêm một nút vào BST
    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);

        return root;
    }

    // Hàm xoá một phần tử khỏi BST
    public boolean delete(int val) {
        TreeNode parent = null;
        TreeNode current = root;
        boolean isLeftChild = false;

        // Tìm node chứa giá trị cần xoá và node cha của nó
        while (current != null && current.val != val) {
            parent = current;
            if (val < current.val) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        // Nếu không tìm thấy giá trị trong BST
        if (current == null)
            return false;

        // Xử lý trường hợp xoá node không có con trái
        if (current.left == null) {
            if (current == root)
                root = current.right;
            else if (isLeftChild)
                parent.left = current.right;
            else
                parent.right = current.right;
        }
        // Xử lý trường hợp xoá node không có con phải
        else if (current.right == null) {
            if (current == root)
                root = current.left;
            else if (isLeftChild)
                parent.left = current.left;
            else
                parent.right = current.left;
        }
        // Xử lý trường hợp xoá node có cả con trái và con phải
        else {
            TreeNode successor = getSuccessor(current);
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.left = successor;
            else
                parent.right = successor;
            successor.left = current.left;
        }

        return true;
    }

    // Hàm tìm node kế tiếp trong thứ tự tăng dần
    private TreeNode getSuccessor(TreeNode node) {
        TreeNode parent = node;
        TreeNode successor = node;
        TreeNode current = node.right;

        while (current != null) {
            parent = successor;
            successor = current;
            current = current.left;
        }

        if (successor != node.right) {
            parent.left = successor.right;
            successor.right = node.right;
        }

        return successor;
    }

    // Hàm thực hiện duyệt theo thứ tự in-order
    public void inorderTraversal() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }
}
