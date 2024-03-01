//Jessica Amelia (16) SIB 1A
import java.util.Scanner;
public class PlatMobil16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array untuk kode plat mobil
        char KODE [] = {'A','B','D','E','F','G','H','L','N','T'};

        // Array dua dimensi untuk nama kota
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N','G','A','N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N','G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y','A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        // Mendapatkan input kode plat nomor dari user
        System.out.print("Masukkan kode plat nomor: ");
        String kodePlat = input.nextLine();

        // Mencari indeks kode plat dalam array KODE
        int indeksKode = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (kodePlat.charAt(0) == KODE[i]) {
                indeksKode = i;
                break;
            }
        }

        // Menampilkan nama kota jika kode plat ditemukan
        if (indeksKode != -1) {
            System.out.print("Nama kota: ");
            for (int j = 0; j < KOTA[indeksKode].length; j++) {
                System.out.print(KOTA[indeksKode][j]);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
    }
}
