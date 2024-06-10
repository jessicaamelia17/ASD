package Tugas;

public class Graph {
    private String[] kota;
    private int[][] adjMatrix;
    private int jumlahKota;

    public Graph(int jumlahKota) {
        kota = new String[jumlahKota];
        adjMatrix = new int[jumlahKota][jumlahKota];
        this.jumlahKota = 0;
    }
    //Metode untuk menambahkan kota ke dalam graf.
    public void addCity(String city) {
        if (jumlahKota < kota.length) {
            kota[jumlahKota++] = city; // Tambahkan kota ke dalam array dan tingkatkan jumlah kota
        }
    }
    //Metode untuk menambahkan sisi (jarak) antara dua kota ke dalam graf.
    public void addEdge(String city1, String city2, int distance) {
        int index1 = getCityIndex(city1); 
        int index2 = getCityIndex(city2);
        if (index1 != -1 && index2 != -1) {
            adjMatrix[index1][index2] = distance; // Tambahkan jarak dari kota1 ke kota2
            adjMatrix[index2][index1] = distance; // Karena graf tidak berarah, tambahkan jarak dari kota2 ke kota1 juga
        }
    }
    // Metode untuk mencetak graf dengan informasi jarak antar kota.
    public void printGraph() { 
        for (int i = 0; i < jumlahKota; i++) {
            System.out.println(kota[i] + ":");
            for (int j = 0; j < jumlahKota; j++) {
                if (adjMatrix[i][j] != 0) {
                    System.out.println("- Jarak ke " + kota[j] + ": " + adjMatrix[i][j]);
                }
            }
        }
    }

    //Metode untuk mendapatkan indeks kota berdasarkan nama kota.
    public int getCityIndex(String city) { 
        for (int i = 0; i < jumlahKota; i++) {
            if (kota[i].equalsIgnoreCase(city)) {
                return i;
            }
        }
        return -1; // jika kota tidak ditemukan
    }
}

