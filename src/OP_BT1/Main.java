package OP_BT1;

public class Main {
    public static void main(String[] args) {
        BTS bts = new BTS();
        bts.insert(27);
        bts.insert(14);
        bts.insert(35);
        bts.insert(10);
        bts.insert(19);
        bts.insert(31);
        bts.insert(42);


        bts.postorderTraversal();
    }
}
