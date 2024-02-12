import java.util.Scanner;
public class Rumus16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        boolean kondisi = true;
        while (kondisi){
            System.out.println("==============================================");
            System.out.println("|           Menu :                           |");
            System.out.println("|   1. Menghitung hasil perhitungan Kecepatan|");
            System.out.println("|   2. Menghitung hasil perhitungan Jarak    |");
            System.out.println("|   3. Menghitung hasil perhitungan Waktu    |");
            System.out.println("|   4. Exit                                  |");
            System.out.println("==============================================");
            System.out.print("Pilih menu : ");
            int pilihan = input.nextInt();
            double jarak, waktu, kecepatan;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jarak yang ditempuh (Kilometer): ");
                    jarak = input.nextInt();
                    System.out.print("Masukkan lama waktu yang ditempuh (Jam): ");
                    waktu = input.nextInt();

                    kecepatan = jarak/waktu;
                    System.out.println("Hasil perhitungan kecepatan: "+ kecepatan +" Km/jam");
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan yang ditempuh (Km/jam): ");
                    kecepatan = input.nextInt();
                    System.out.print("Masukkan lama waktu yang ditempuh (Jam): ");
                    waktu = input.nextInt();
                    
                    jarak = kecepatan*waktu;
                    System.out.println("Hasil perhitungan jarak: " +jarak+" Km");
                    break;
                case 3:
                    System.out.print("Masukkan jarak yang ditempuh (Kilometer): ");
                    jarak = input.nextInt();
                    System.out.print("Masukkan kecepatan yang ditempuh (Km/jam): ");
                    kecepatan = input.nextInt();

                    waktu = jarak/kecepatan;
                    System.out.println("Hasil perhitungan waktu: " +waktu+" Jam");
                    break;
                case 4:
                    kondisi = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
