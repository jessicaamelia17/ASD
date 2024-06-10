package UTS;

public class Kendaraan {
    public String tipe;
    public String platNomor;
    public int durasi;
    public double biaya;

    public Kendaraan (String tipe, String platNomor, int durasi){
        this.tipe = tipe;
        this.platNomor = platNomor;
        this.durasi =  durasi;
        this.biaya = hitungBiaya();
    }

    public double hitungBiaya(){
        if(tipe.equalsIgnoreCase("mobil")){
            return 3000 * durasi;
        } else if (tipe.equalsIgnoreCase("motor")){
            return 1000 * durasi;
        }else {
            return 0;
        }
    }

}
