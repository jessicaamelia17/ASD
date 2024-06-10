package PRAKTIKUM09.Tugas;

class Point {
    String question;
    String answer;
    Point next;

    Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }
}