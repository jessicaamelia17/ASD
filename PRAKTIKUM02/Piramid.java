public class Piramid {
    double tinggi;
    double sisiAlas;
    double volume;
    double sisiTegak;

    // Constructor
    public Piramid(double newTinggi, double newSisiAlas, double newSisiTegak) {
        tinggi = newTinggi;
        sisiAlas = newSisiAlas;
        sisiTegak = newSisiTegak;
       
    }

    // Menghitung luas permukaan piramid
    public void menghitungLuasPermukaan() {
        double luasAlas = menghitungLuasAlas();
        double luasSegitiga = sisiAlas * sisiTegak / 2;
        double luasPermukaan =  luasAlas + 4 * luasSegitiga;
        System.out.println("Luas permukaan piramid: " + luasPermukaan);
    }

    // Menghitung volume piramid
    public void menghitungVolume() {
        double luasAlas = menghitungLuasAlas();
        volume = (luasAlas * tinggi) / 3;
        System.out.println("Volume piramid: " + volume);
    }

    // Menghitung luas alas piramid
    public double menghitungLuasAlas() {
        return sisiAlas * sisiAlas;
    }

    // Menghitung keliling alas piramid
    public void menghitungKeliling() {
        double keliling = 4 * sisiAlas + sisiTegak;
        System.out.println("Keliling alas piramid: " + keliling);
    }
}

