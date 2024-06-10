package PRAKTIKUM08.Tugas;

import java.util.Scanner;
public class KlinikDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan kapasitas pasien: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas);
        do{
            System.out.println("====================================");
            System.out.println("\tDaftar Menu Klinik: ");
            System.out.println("====================================");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Keluarkan Data Pasien");
            System.out.println("3. Lihat Daftar Antrian");
            System.out.println("4. Lihat Pasien Antrian Terdepan");
            System.out.println("5. Lihat Pasien Antrian Paling Belakang ");
            System.out.println("6. Cari Posisi Antrian Pasien");
            System.out.println("7. Menghapus Semua Data Pasien");
            System.out.println("8. Exit");
            System.out.println("-----------------------------------");

            menu = sc.nextInt();
            sc.nextLine(); 
            switch(menu){
                case 1:
                if (myQueue.isFull()){
                    System.out.println("Antrian sudah penuh.");
                }else {
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan no ID: ");
                    String noID = sc.next();
                    sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (L/P): ");
                    char jenisKelamin = sc.nextLine().charAt(0);

                    Pasien newPasien = new Pasien(nama, noID,jenisKelamin );
                    myQueue.enqueue(newPasien);
                }
                    break;
                case 2: 
                    Pasien deleteData = myQueue.dequeue();
    
                    if(deleteData != null){
                        System.out.println("Data Pasien selesai periksa: " + deleteData);
                    }
    
                    break;
                case 3:
                    myQueue.daftarPasien();
                    break;
                case 4:
                    myQueue.peek();
                    break;
                case 5:
                    myQueue.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pasien yang ingin dicari:  ");
                    String namaCari = sc.nextLine();
                    myQueue.peekPosition(namaCari);
                    break;
                case 7:
                    System.out.println("Data Telah Terhapus Seluruhnya");
                    break;
                case 8:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                
            }
        }while (menu >=1 && menu <=7);
        
    }

}
