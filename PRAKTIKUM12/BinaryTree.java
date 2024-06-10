package PRAKTIKUM12;

public class BinaryTree {
    Node root;

    boolean isEmpty(){
        return root == null;
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;

        while (current != null){
            if (current.data == data){
                hasil = true;
                break;
            } else if (data < current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void add(int data){
        if (isEmpty()){
            root = new Node(data);
        } else {
            Node current = root;

            while(true){
                if (data < current.data){
                    if(current.left != null){
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data){
                    if (current.right != null){
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {// data already exists
                    break;
                }
            }
        }
    }

    void traversePreOrder (Node node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder (Node node){
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder (Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor (Node del){
        Node successor = del.right;
        Node successorParent= del;

        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(int data){
        if (isEmpty()){
            System.out.println("Tree is Empty!");
            return;
        }

        //find node(current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;

        while (current != null){
            if (current.data == data){
                break;
            } else if( data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if ( data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //deletion
        if ( current == null){
            System.out.println("Couldn't find data!");
            return;
        } else {
            //if there is no child, simply delete it
            if ( current.left == null && current.right == null){
                if(current == root){
                    root = null;
                } else {
                    if (isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if ( current.left == null){// if there is 1 child (right)
                if (current == root){
                    root = current.right;
                } else {
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if ( current.right == null) {
                if (current == root){
                    root = current.left;
                } else {
                    if (isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root){
                    root = successor;
                } else {
                    if (isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }

                    successor.left = current.left;
                     
                }
            }
        }
        
    }
    // Metode untuk menampilkan data pada leaf
    public void printLeaf(Node node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) { // Cek apakah node merupakan leaf
            System.out.print(" " + node.data);
        }
        // Rekursif: lanjutkan ke anak kiri dan anak kanan
        printLeaf(node.left);
        printLeaf(node.right);
    }

    // Metode untuk menghitung jumlah leaf
    public int countLeaf(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) { // Jika node merupakan leaf, return 1
            return 1;
        }
        // Rekursif: jumlah leaf dari anak kiri dan anak kanan
        return countLeaf(node.left) + countLeaf(node.right);
    }

}
