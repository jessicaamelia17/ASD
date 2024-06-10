package PRAKTIKUM08.Tugas;

public class Queue {
    public Pasien[] antrian;
    public int max;
    public int size;
    public int front;
    public int rear;

    public Queue(int max){
        this.max = max;
        this.antrian = new Pasien[max];
        this.size =0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty(){
        return (size ==0);
    }

    public boolean isFull(){
        return(size == max);
    }
    public void enqueue (Pasien dt){
        if (isFull()){
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()){
                front = rear =0;
            } else if (rear == max -1){
                rear =0;
            } else {
                rear = rear + 1;
            }
        }
        antrian[rear] = dt;
        size++;
    }

    public Pasien dequeue(){
        Pasien temp = null;

        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            temp = antrian[front];
            size--;

            if (isEmpty()){
                front = rear = -1;
            } else if (front == max -1) {
                front =0;
            } else{
                front++;
            }
        }

        return temp;
    }

    public void peek(){
        if (!isEmpty()){
            System.out.println("Pasien diantrian depan: " + antrian[front]);
        }else {
            System.out.println("Pasien kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()){
            System.out.println("Pasien diantrian belakang: " + antrian[rear]);
        }else {
            System.out.println("Pasien kosong");
        }
    }

    public void peekPosition(String nama){
        boolean found = false;
        int i = front;
        int position = 1;
    
        do {
            if(antrian[i].nama.equalsIgnoreCase(nama)){
                System.out.println("Posisi pasien: " + nama  + " dalam antrian: " + position);
                System.out.println("ID Pasien: " + antrian[i].noID);
                System.out.println("Jenis Kelamin Pasien: " + antrian[i].jenisKelamin);
                found = true;
                break;
            }
            i = (i+1) % max;
            position++;
        } while(i != (rear +1) % max);
        
        if (!found){
            System.out.println("Pasien " + nama + " tidak ditemukan dalam antrian ");
        }
    }
    
    public void daftarPasien(){
        if(isEmpty()){
            System.out.println("Antrian kosong");
        } else {
            int i = front;
            System.out.println("Daftar Pasien dalam Antrian: ");
            while (i != rear){
                System.out.println(antrian[i] + " ");
                i = (i+1) % max;
            }

            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah pasien: " + size);
        }
    }

    public void clear(){
        front = rear = -1;
        size = 0;
    }

}
