public class Pengguna {
    String nama;
    String namaPenerima;
    String layanan;
    String isiBarang;
    String kotaAsal;
    String kotaTujuan;
    double berat;
    long noHpPenerima;

    public void buatPake (String newNama, String newNamaPenerima, String newLayanan, String newIsiBarang, String newkotaAsal,
    String newKotaTujuan, double newBerat, long newHpPenerima){
        nama = newNama;
        namaPenerima = newNamaPenerima;
        layanan = newLayanan;
        isiBarang = newIsiBarang;
        kotaAsal = newkotaAsal;
        kotaTujuan = newKotaTujuan;
        berat = newBerat;
        noHpPenerima = newHpPenerima;
    }
}
