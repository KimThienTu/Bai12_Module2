package TH_CaiDatCayNhiPhan;

//public abstract class BST<E extends Comparable<E>> extends AbstractTree<E> {
//    public BST() {
//    }
//
//    public BST(E[] objects) {
//        for (int i = 0; i < objects.length; i++)
//            insert(objects[i]);
//    }
//
//    @Override
//    public boolean insert(E e) {
//        if (root == null)
//            root = createNewNode(e);
//        else {
//            TreeNode<E> parent = null;
//            TreeNode<E> current = root;
//            while (current != null) {
//                if (e.compareTo(current.element) < 0) {
//                    parent = current;
//                    current = current.left;
//                } else if (e.compareTo(current.element) > 0) {
//                    parent = current;
//                    current = current.right;
//                } else
//                    return false;
//            }
//
//            if (e.compareTo(parent.element) < 0)
//                parent.left = createNewNode(e);
//            else
//                parent.right = createNewNode(e);
//        }
//
//        size++;
//        return true;
//    }
//
//    protected TreeNode<E> createNewNode(E e) {
//        return new TreeNode<>(e);
//    }
//
//    @Override
//    public int getSize() {
//        return size;
//    }
//
//}
