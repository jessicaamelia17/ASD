package PRAKTIKUM05;

public class Hotel {
    public String nama;
    public int harga;
    public int rating;

    public Hotel(String nama, int harga, int rating) {
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
    }

  
    public void  displayInfo() {
        System.out.println("Hotel (" +
                "nama='" + nama + '\'' +
                ", price=" + harga +
                ", rating=" + rating +
                ')');
    }
}
