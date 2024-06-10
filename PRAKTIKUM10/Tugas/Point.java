package PRAKTIKUM10.Tugas;
//Modifikasi
class Point {
    String question;
    String answer;
    Point next;
    Point prev;

    Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
        this.prev = null;
    }
}