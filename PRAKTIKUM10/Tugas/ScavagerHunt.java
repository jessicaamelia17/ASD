package PRAKTIKUM10.Tugas;
import java.util.Scanner;
//Modifikasi
class ScavengerHunt {
    Point head;
    Point tail;
    Point currentPoint;
    Point lastWrongPoint;
    // Metode untuk menambahkan titik baru dengan pertanyaan dan jawaban
    public void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        if (head == null) {
            head = newPoint;
            tail = newPoint; //Modifikasi 
            currentPoint = head;
        } else {//Modifikasi
            tail.next = newPoint;
            newPoint.prev = tail;
            tail = newPoint;
        }
    }
    //Modifikasi
    // Metode untuk memainkan permainan scavenger hunt
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Selamat datang di Scavenger Hunt!");
        System.out.println("=================================");

        while (currentPoint != null) {
            System.out.println("Pertanyaan: " + currentPoint.question);
            System.out.print("Jawaban Anda: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(currentPoint.answer)) {
                System.out.println("Jawaban Anda benar!");
                currentPoint = currentPoint.next;
                lastWrongPoint = null; // Reset lastWrongPoint setelah jawaban benar
            } else {
                System.out.println("Jawaban Anda salah! Coba lagi.");
                lastWrongPoint = currentPoint; // Set lastWrongPoint ke currentPoint yang salah

                String response;
                do {
                    System.out.print("Apakah Anda ingin kembali ke pertanyaan terakhir yang salah? (y/t): ");
                    response = scanner.nextLine();
                } while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("t"));

                if (response.equalsIgnoreCase("y") && lastWrongPoint != null) {
                    currentPoint = lastWrongPoint;
                } else {
                    System.out.println("Melanjutkan ke pertanyaan berikutnya.");
                    currentPoint = currentPoint.next;
                }
            }
        }
        scanner.close();
        System.out.println("==============================================");
        System.out.println("Selamat! Anda telah menyelesaikan Scavenger Hunt\ndan menemukan harta karun!");
        System.out.println("==============================================");
    }
}
