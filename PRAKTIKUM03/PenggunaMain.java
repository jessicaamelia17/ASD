import java.util.Scanner;
public class PenggunaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan banyak pengguna: ");
        int jumlah = sc.nextInt();
        Pengguna[] penggunaArray = new Pengguna[jumlah];

        for (int i=0; i<penggunaArray.length; i++){
            penggunaArray[i] = new Pengguna();
            System.out.println("Data Pengguna ke- "+ (i+1));
            System.out.print("Nama pengirim: ");
            penggunaArray[i].nama= sc.next();
            System.out.print("Nama penerima: ");
            penggunaArray[i].namaPenerima= sc.next();
            System.out.print("Layanan: ");
            penggunaArray[i].layanan= sc.next();
            System.out.print("Isi barang: ");
            penggunaArray[i].isiBarang= sc.next();
            System.out.print("Kota Asal: ");
            penggunaArray[i].kotaAsal= sc.next();
            System.out.print("Kota Tujuan: ");
            penggunaArray[i].kotaTujuan= sc.next();
            System.out.print("Berat barang: ");
            penggunaArray[i].berat= sc.nextDouble();
            System.out.print("No. Hp Penerima: ");
            penggunaArray[i].noHpPenerima= sc.nextLong();
            sc.nextLine();
        }
        for (Pengguna dataPaket : penggunaArray){
            int index=0;
            System.out.println("Data Paket");
            System.out.println("Data Pengguna ke- "+ (index+1));
            System.out.println("Nama Pengirim: " + dataPaket.nama);
            System.out.println("Nama Penerima: " + dataPaket.namaPenerima);
            System.out.println("Layanan: " + dataPaket.layanan);
            System.out.println("Isi Barang: " + dataPaket.isiBarang);
            System.out.println("Kota Asal: " + dataPaket.kotaAsal);
            System.out.println("Kota Tujuan: " + dataPaket.kotaTujuan);
            System.out.println("Berat Barang: " + dataPaket.berat);
            System.out.println("No.Hp Penerima: " + dataPaket.noHpPenerima);
        }
    }
}
