package PRAKTIKUM09.Tugas;
import java.util.Scanner;
class ScavengerHunt {
    Point head;
    Point currentPoint;

    // Metode untuk menambahkan titik baru dengan pertanyaan dan jawaban
    public void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        if (head == null) {
            head = newPoint;
            currentPoint = head;
        } else {
            Point temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newPoint;
        }
    }

    // Metode untuk memainkan permainan scavenger hunt
    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Scavenger Hunt!");

        while (currentPoint != null) {
            System.out.println("Pertanyaan: " + currentPoint.question);
            System.out.print("Jawaban Anda: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(currentPoint.answer)) {
                System.out.println("Jawaban Anda benar! Anda dapat melanjutkan ke titik berikutnya.");
                currentPoint = currentPoint.next;
            } else {
                System.out.println("Jawaban Anda salah! Coba lagi.");
            }
        }

        scanner.close();

        System.out.println("Selamat! Anda telah menyelesaikan Scavenger Hunt dan menemukan harta karun!");
    }
}
