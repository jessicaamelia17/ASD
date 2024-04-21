package PRAKTIKUM06;

public class Sorting {
    public static int sequentitalSearch(int[] arr, int key){
        int hasil = -1;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==key){
                hasil = i;
                break;
            }
        }
        return hasil;
    }

    public static int binarySearchAsc(int[] arr, int key){
        int start = 0, end = arr.length -1;
    
        while (start <= end){
            int mid = start + (end - start)/2;
            
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid]< key){
                start = mid + 1;
            } 
            else{
                end = mid -1;
            }
        }
        return -1;

    }

    public static int binarySearchDesc(int[] arr, int key){
        int start = 0, end = arr.length -1;
    
        while (start <= end){
            int mid = start + (end - start)/2;
            
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid]< key){
                end = mid -1;
            } 
            else{
                start = mid + 1;
            }
        }
        return -1;

    }

    public static int binarySearch (int [] arr, int key){
        if (arr.length == 0) {
            return -1;
        }

        if (arr[0] < arr[arr.length - 1]) {
            // Data terurut secara ascending
            return binarySearchAsc(arr, key);
        } else {
            // Data terurut secara descending
            return binarySearchDesc(arr, key);
        }
    }

    
    public static void main(String[] args) {
        //sequential seacrh
        int[] daftarNilai = {10,5,20,15,5,45};
        int key =5;
        int hasilIndeks = sequentitalSearch(daftarNilai, key);
        if(hasilIndeks != -1){
            System.out.println("Data " + key + " ditemukan pada indeks ke-" + hasilIndeks);
        }else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
        //binary ascending
        int[] sortedNilai = {5,5,10,20,30,40,50};
        int index = binarySearchAsc(sortedNilai, 5);
        if(index != -1){
            System.out.println("Data  ditemukan pada indeks ke-" + index + " dalam array yang terurut secara descending.");
        }else {
            System.out.println("Data tidak ditemukan");
        }
        //binary descending
        int[] descendingSortedNilai = {35, 30, 25, 20, 15, 10, 5};
        int indexDesc = binarySearchDesc(descendingSortedNilai, 20);
        if(indexDesc != -1){
            System.out.println("Data ditemukan pada indeks ke-" + indexDesc + " dalam array yang terurut secara descending.");
        }else {
            System.out.println("Data tidak ditemukan dalam array yang terurut secara descending.");
        }
        // binary search
        int[] sortedValues = {45, 35, 30, 25, 20, 15, 10, 5};
        int indexBinary = binarySearch(sortedValues, 20);
        if(indexBinary != -1){
            System.out.println("Data ditemukan pada indeks ke-" + indexBinary);
        }else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
