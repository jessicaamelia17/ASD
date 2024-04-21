package PRAKTIKUM05;

public class Hotels {
    Hotel [] dataHotels;
    int index;

    public Hotels(int hotel ){
        dataHotels = new Hotel[hotel];
    }

    public void add(Hotel daftarHotels){
        if (index < dataHotels.length){
            dataHotels[index] = daftarHotels;
            index++;
        }else {
            System.out.println("Data Hotel tidak tersedia");
        }
    }

    public void displayInfo(){
        for (Hotel daftarHotel : dataHotels){
            daftarHotel.displayInfo();
        }
    }

    public void bubbleSortHotelsByHarga() {
        int n = dataHotels.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dataHotels[j].harga > dataHotels[j + 1].harga) {
                    Hotel temp = dataHotels[j];
                    dataHotels[j] = dataHotels[j + 1];
                    dataHotels[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortHotelsByRating() {
        int n = dataHotels.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (dataHotels[j].rating > dataHotels[minIndex].rating) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Hotel temp = dataHotels[i];
                dataHotels[i] = dataHotels[minIndex];
                dataHotels[minIndex] = temp;
            }
        }
    }
}
