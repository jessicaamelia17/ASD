import java.util.Scanner;
public class InformasiMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InformasiMahasiswa[] arrayInformasi = new InformasiMahasiswa[3];

        for(int i=0 ; i<3; i++){
            arrayInformasi[i] = new InformasiMahasiswa(); 
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama: ");
            arrayInformasi[i].nama = sc.next();
            System.out.print("Masukkan NIM: ");
            arrayInformasi[i].nim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            arrayInformasi[i].jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            arrayInformasi[i].ipk = sc.nextDouble();
            sc.nextLine();
        }
        double totalIPK =0;
        for(int i=0; i<3; i++){
            totalIPK += arrayInformasi[i].ipk;
        }
        double rataRataIPK = totalIPK/3;

        for (InformasiMahasiswa informasi : arrayInformasi){
            int index = 0;
            System.out.println("Data Mahasiswa ke- "+(index+1));
            System.out.println("Nama: "+ informasi.nama);
            System.out.println("Nim: "+ informasi.nim);
            System.out.println("Jenis kelamin: " + informasi.jenisKelamin);
            System.out.println("Nilai IPK: "+ informasi.ipk);
        }
        System.out.printf("Rata-rata IPK:%.2f",rataRataIPK );
    }
}
