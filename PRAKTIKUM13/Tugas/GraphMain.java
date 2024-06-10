package Tugas;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input jumlah kota dari pengguna
        System.out.print("Input jumlah kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); 
        // Inisialisasi objek graph dengan jumlah kota yang dimasukkan
        Graph graph = new Graph(jumlahKota);
        // Meminta pengguna untuk memasukkan nama kota dan menambahkannya ke dalam graph
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Input nama kota: ");
            String namaKota = scanner.nextLine();
            graph.addCity(namaKota);
        }
        // Input jumlah jalan dari pengguna
        System.out.print("Input jumlah jalan: ");
        int jumlahJalan = scanner.nextInt();
        scanner.nextLine(); 

        // Meminta pengguna untuk memasukkan informasi jalan antara kota-kota dan menambahkannya ke dalam graph
        for (int i = 0; i < jumlahJalan; i++) {
            System.out.print("Kota 1: ");
            String kota1 = scanner.nextLine();
            System.out.print("Kota 2: ");
            String kota2 = scanner.nextLine();
            System.out.print("Jarak " + kota1 + " - " + kota2 + ": ");
            int jarak = scanner.nextInt();
            scanner.nextLine(); 

            graph.addEdge(kota1, kota2, jarak);
        }
         // Cetak informasi graph yang telah dibuat
        graph.printGraph();

        scanner.close();
    }
}
