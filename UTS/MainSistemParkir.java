package UTS;
import java.util.Scanner;
public class MainSistemParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SistemParkir sistemParkir = new SistemParkir();
        boolean kondisi = true;
        while (kondisi){
            System.out.println("----------------------------------------");
            System.out.println("|           Menu :                     |");
            System.out.println("|   1. Input Data                      |");
            System.out.println("|   2. Cari Data                       |");
            System.out.println("|   3. Lihat Data                      |");
            System.out.println("|   4. Laporan                         |");
            System.out.println("----------------------------------------");
            System.out.print("Pilih menu : ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan){
                case 1:
                System.out.print("Tipe Kendaraan (mobil/motor): ");
                String tipe = sc.nextLine();
                System.out.print("Plat nomor: ");
                String platNomor = sc.nextLine();
                System.out.print("Durasi parkir (jam): ");
                int durasiParkir = sc.nextInt();
                sistemParkir.inputData(tipe, platNomor, durasiParkir);
                break;
                
                case 2:
                System.out.print("Masukkan plat nomor yang ingin dicari: ");
                String platNomorCari = sc.nextLine();
                sistemParkir.cariData(platNomorCari);
                break;
                
                case 3:
                    sistemParkir.lihatData();
                break;
                
                case 4:
                    sistemParkir.laporan();
                    kondisi=false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
                }
            }
        
    }
}
