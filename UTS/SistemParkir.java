package UTS;

public class SistemParkir {
    Kendaraan[] dataParkir = new Kendaraan [100];
    int jumlahData = 0;

    public void inputData (String tipe, String platNomot, int durasi){
        if (jumlahData < dataParkir.length){
            dataParkir[jumlahData] = new Kendaraan(tipe, platNomot, durasi);
            jumlahData++;
            System.out.println("Total biaya: " + dataParkir[jumlahData - 1].biaya);
        } else {
            System.out.println("Parkiran sudah penuh");
        }
    }


    public void cariData (String platNomor){
        boolean found = false;
        for (int i = 0; i < jumlahData; i++) {
            if (dataParkir[i].platNomor.contains(platNomor)) {
                System.out.println("Data ditemukan:");
                System.out.println("Tipe: " + dataParkir[i].tipe);
                System.out.println("Plat Nomor: " + dataParkir[i].platNomor);
                System.out.println("Durasi Parkir: " + dataParkir[i].durasi + " jam");
                System.out.println("Biaya: " + dataParkir[i].biaya);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public void lihatData() {
        sortDataByBiayaDesc();
        System.out.println("Data parkir:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Tipe: " + dataParkir[i].tipe);
            System.out.println("Plat Nomor: " + dataParkir[i].platNomor);
            System.out.println("Durasi Parkir: " + dataParkir[i].durasi + " jam");
            System.out.println("Biaya: " + dataParkir[i].biaya);
            System.out.println();
        }
    }

    public void sortDataByBiayaDesc() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (dataParkir[j].biaya < dataParkir[j + 1].biaya) {
                    Kendaraan temp = dataParkir[j];
                    dataParkir[j] = dataParkir[j + 1];
                    dataParkir[j + 1] = temp;
                }
            }
        }
    }

    void laporan() {
        int totalMobil = 0;
        int totalMotor = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (dataParkir[i].tipe.equalsIgnoreCase("mobil")) {
                totalMobil += dataParkir[i].biaya;
                
            } else if (dataParkir[i].tipe.equalsIgnoreCase("motor")) {
                totalMotor += dataParkir[i].biaya;
            }
        }

        System.out.println("Laporan:");
        System.out.println("Total pendapatan dari mobil: " + totalMobil);
        System.out.println("Total pendapatan dari motor: " + totalMotor);
    }
}
