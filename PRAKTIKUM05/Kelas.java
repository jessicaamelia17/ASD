package PRAKTIKUM05;

public class Kelas {
    Mahasiswa[] daftarMahasiswa;
    int index;

    public Kelas(int kuota){
        daftarMahasiswa = new Mahasiswa[kuota];
    }

    public void add(Mahasiswa mahasiswa){
        if (index < daftarMahasiswa.length){
            daftarMahasiswa[index] = mahasiswa;
            index++;
        }else {
            System.out.println("Kelas sudah penuh");
        }
    }

    public void displayInfo(){
        for (Mahasiswa mahasiswa : daftarMahasiswa){
            mahasiswa.displayInfo();
        }
    }

    public void bubbleSortByIPK (){
        int n = daftarMahasiswa.length;

        for (int i =0; i < n-1; i++){
            for (int j =0; j < n -i -1; j++){
                if (daftarMahasiswa[j]. ipk> daftarMahasiswa[j+1].ipk){
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j+1];
                    daftarMahasiswa[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortByUmur(){
        int n= daftarMahasiswa.length;

        for (int i=0; i< n-1; i++){
            int minIndex = i;

            for (int j=i +1; j< n; j++){
                if (daftarMahasiswa[j].umur < daftarMahasiswa[minIndex].umur){
                    minIndex=j;
                }
            }

            Mahasiswa temp = daftarMahasiswa[minIndex];
            daftarMahasiswa[minIndex] = daftarMahasiswa[i];
            daftarMahasiswa[i] = temp;
        }
    }

    public void insertionSortByIPKDesc(){
        int n = daftarMahasiswa.length;

        for (int i=1; i < n; i++){
            Mahasiswa key = daftarMahasiswa[i];
            int j = i -1;

            while (j >= 0 && daftarMahasiswa[j].ipk < key.ipk){
                daftarMahasiswa[j+1] = daftarMahasiswa[j];
                j = j-1;
            }

            daftarMahasiswa[j+1] = key;
        }
    }

    public void sequentialSearchByNama(String keyword) {
        boolean ditemukan = false;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa != null && mahasiswa.nama.contains(keyword)) {
                System.out.println("Mahasiswa yang dicari:");
                System.out.println("Nama: " + mahasiswa.nama);
                System.out.println("Umur: " + mahasiswa.umur);
                System.out.println("IPK: " + mahasiswa.ipk);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mahasiswa dengan nama\"" + keyword + "\".");
        }
    }

    public int binarySearchByUmur(int umur) {
        int low = 0;
        int high = daftarMahasiswa.length - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midUmur = daftarMahasiswa[mid].umur;
    
            if (umur == midUmur) {
                System.out.println("Mahasiswa dengan umur " + umur + ":");
                System.out.println("Name: " + daftarMahasiswa[mid].nama);
                System.out.println("IPK: " + daftarMahasiswa[mid].ipk);
                return mid;
            } else if (umur < midUmur) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    
        System.out.println("Mahasiswa dengan " + umur + " tidak ditemukan.");
        return -1;
    }
}
