package PRAKTIKUM05;

public class HotelMain {
    public static void main(String[] args) {
        Hotels dataHotel = new Hotels(5);
        Hotel hotel1 = new Hotel("Hotel A", 100, 2);
        Hotel hotel2 = new Hotel("Hotel B", 200, 5);
        Hotel hotel3 = new Hotel("Hotel C", 150, 3);
        Hotel hotel4 = new Hotel("Hotel D", 250, 1);
        Hotel hotel5 = new Hotel("Hotel E", 300, 4);

        dataHotel.add(hotel1); 
        dataHotel.add(hotel2);
        dataHotel.add(hotel3);
        dataHotel.add(hotel4);
        dataHotel.add(hotel5);

        dataHotel.bubbleSortHotelsByHarga();
        dataHotel.selectionSortHotelsByRating();
        dataHotel.displayInfo();

        
    
    }
}
