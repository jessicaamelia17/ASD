package PRAKTIKUM12;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println(" Hasil traverse PreOrder: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println(" Hasil traverse InOrder: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println(" Hasil traverse PostOrder: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println(" Find " + bt.find(5));
        System.out.println(" Hasil setelah data 8 dihapus: ");
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println(" Data leaf: ");
        bt.printLeaf(bt.root);
        System.out.println("");
        System.out.println(" Jumlah leaf dalam tree: " + bt.countLeaf(bt.root));
    
        
    }
}
