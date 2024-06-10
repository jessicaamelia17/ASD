package PRAKTIKUM08.Tugas;

public class Pasien {
    public String nama;
    public String noID;
    public char jenisKelamin;

    public Pasien (String nama, String noID, char jenisKelamin){
        this.nama = nama;
        this.noID = noID;
        this.jenisKelamin = jenisKelamin;
    }

    public String toString(){
        return "Nama Pasien: " + nama + ", No ID: " + noID + ", Jenis Kelamin: " + jenisKelamin;
    }
}
