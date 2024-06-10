package PRAKTIKUM09;

public class LinkedList {
    Node head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if(!isEmpty()){
            System.out.print("Isi linked list: ");
            Node currentNode = head;

            while(currentNode != null){
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node newNode = new Node(input, null);

        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null){
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input){
        Node newNode = new Node(input, null);

        if(!isEmpty()){
            Node currentNode = head;

            do{
                if (currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }

    
    public int getData(int index){
        Node currentNode = head;
        //modifikasi
        for (int i=0; i< index; i++){
            if(currentNode == null){
                return -1;
            }
            currentNode = currentNode.next;
        }
        
        return currentNode.data;
    }

    public int indexOf(int key){
        Node currentNode = head;
        int index =0;
        
        while(currentNode != null && currentNode.data !=key){
            currentNode = currentNode.next;
            index++;
        }

        if(currentNode==null){
            return -1;
        }else {
            return index;
        }
    }

    public void removeFirst(){
        if(!isEmpty()){
            head = head.next;
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list kosong");
        }else if (head.next == null){
            head = null;
        }else {
            Node currentNode = head;
            while (currentNode.next != null){
                if(currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list kosong");
        }else if (head.data == key){
            removeFirst();
        }else {
            Node currentNode = head;
            
            while (currentNode.next !=null){
                if(currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                
                currentNode = currentNode.next;
            }
        }
    }
    //TUGAS

    // Metode untuk menambahkan node sebelum keyword yang diinginkan
    public void insertBefore(int key, int newData) {
        Node newNode = new Node(newData, null);

        // Jika linked list kosong atau keyword adalah head
        if (isEmpty() || head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        // Iterasi hingga menemukan node sebelum keyword
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        // Jika keyword tidak ditemukan
        if (current.next == null) {
            System.out.println("Keyword not found.");
            return;
        }

        // Tautkan node baru sebelum node dengan keyword
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method untuk menambahkan data baru pada indeks tertentu
    public void insertAt(int index, int key) {
        Node newNode = new Node(key, null);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node currentNode = head;
            int currentIndex = 0;
            
            // Iterasi hingga mencapai indeks sebelumnya
            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }

            // Jika indeks lebih besar dari panjang linked list,
            // atau jika indeks adalah indeks terakhir
            if (currentNode == null || currentNode.next == null) {
                System.out.println("Index out of bounds.");
                return;
            }

            // Tautkan node baru di antara node pada indeks sebelumnya dan node pada indeks
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    // Metode untuk menghapus node pada index tertentu
    public void removeAt(int index) {
        // Jika linked list kosong
        if (isEmpty()) {
            System.out.println("Linked list is empty.");
            return;
        }

        // Jika index adalah 0
        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int currentIndex = 0;

        // Iterasi hingga mencapai indeks sebelumnya
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        // Jika indeks lebih besar dari panjang linked list
        if (current == null || current.next == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Hapus node pada indeks tertentu
        current.next = current.next.next;
    }

}
