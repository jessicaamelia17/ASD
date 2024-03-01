//Jessica Amelia (16) SIB 1A
import java.util.Scanner;

public class SIAKAD16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================");

        double nilaiAngka[] = new double [8];

        // Array untuk menyimpan nama mata kuliah dan bobot SKS
        String[] MK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] sks = {2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0};

        double totalNilaiSetara = 0.0;
        double totalSks = 0.0;

        for (int i = 0; i < MK.length ; i++) {
            
            System.out.print("Masukkan nilai Angka untuk MK "+MK[i]+ ": ");
             nilaiAngka[i] = input.nextInt();
        }
        System.out.println("================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================");
        System.out.println("MK\t\t\t\t\tNilai Angka\t Nilai Huruf\tBobot Nilai");
        
        for (int i = 0; i < MK.length ; i++) {
           
            String nilaiHuruf;
            double nilaiSetara;
            if (nilaiAngka[i]> 80 && nilaiAngka[i]<=100) {
                nilaiHuruf = "A";
                nilaiSetara = 4.00;
            } else if (nilaiAngka[i]> 73 && nilaiAngka[i]<=80) {
                nilaiHuruf = "B+";
                nilaiSetara = 3.50;
            } else if (nilaiAngka[i]>65 && nilaiAngka[i]<=73) {
                nilaiHuruf = "B";
                nilaiSetara = 3.00;
            } else if (nilaiAngka[i]>60 && nilaiAngka[i]<=65) {
                nilaiHuruf = "C+";
                nilaiSetara = 2.50;
            } else if (nilaiAngka[i]>50 && nilaiAngka[i]<=60) {
                nilaiHuruf = "C";
                nilaiSetara = 2.00;
            } else if (nilaiAngka[i]> 39 && nilaiAngka[i]<=50) {
                nilaiHuruf = "D";
                nilaiSetara = 1.00;
            } else {
                nilaiHuruf = "E";
                nilaiSetara = 0.00;
            }

            System.out.printf("%-40s%-18.2f%-15s%-16s\n", MK[i], nilaiAngka [i], nilaiHuruf, nilaiSetara );

            totalNilaiSetara += nilaiSetara * sks[i];
            totalSks += sks[i];
        }

        double ipSemester = totalNilaiSetara / totalSks;

        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
}
