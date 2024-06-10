package PRAKTIKUM10;

public class DLLDemo {
    public static void main(String[] args) {
        DoubleLinkedList myDLL = new DoubleLinkedList();
        myDLL.print();
        myDLL.addFirst(800);
        myDLL.print();
        myDLL.addFirst(700);
        myDLL.print();
        myDLL.addLast(500);
        myDLL.print();
        myDLL.removeFirst();
        myDLL.print();
        myDLL.removeLast();
        myDLL.print();
        System.out.println("Data pada indeks 0: "+ myDLL.getData(0));
        System.out.println("Data 800 berada pada index ke:  "+ myDLL.indexOf(800));
        myDLL.addFirst(400);
        myDLL.print();
        myDLL.addLast(900);
        myDLL.print();
        System.out.print("Menampilkan Linked List secara mundur: ");
        myDLL.reservePrint();
        myDLL.insertAfter(400, 500);
        myDLL.print();
       
    }
}
