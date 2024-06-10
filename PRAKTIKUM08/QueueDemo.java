package PRAKTIKUM08;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas);
        do{
            System.out.println("====================================");
            System.out.println(" Masukkan operasi yang diinginkan");
            System.out.println("====================================");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.println("-----------------------------------");

            menu = sc.nextInt();
            switch(menu){
                case 1:
                if (myQueue.isFull()){
                    System.out.println("Elemen sudah penuh.");
                }else {
                    System.out.print("Masukkan data baru: ");
                    int newData = sc.nextInt();
                    myQueue.enqueue(newData);
                }
                break;
                case 2: 
                    int deleteData = myQueue.dequeue();
    
                    if(deleteData != 0){
                        System.out.println("Data yang dikeluarkan: " + deleteData);
                    }
    
                    break;
                case 3:
                    myQueue.print();
                    break;
                case 4:
                    myQueue.peek();
                    break;
                case 5:
                    myQueue.clear();
                    break;
            }
        }while (menu >=1 && menu <=5);
        
    }

}
