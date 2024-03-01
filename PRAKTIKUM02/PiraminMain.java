public class PiraminMain {
    
    public static void main(String[] args) {
        // Membuat objek piramid dengan tinggi 5 dan alas 4
        Piramid piramid = new Piramid(9, 14,8);

        // Memanggil metode untuk menghitung luas permukaan, volume, luas alas, dan keliling
        piramid.menghitungLuasPermukaan();
        piramid.menghitungVolume();
        piramid.menghitungKeliling();
    }

}
