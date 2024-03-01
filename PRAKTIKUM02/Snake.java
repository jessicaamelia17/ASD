
public class Snake {
    // Atribut
    int x;
    int y;
    
    // Constructor
    public Snake(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    // Method moveLeft
    public void moveLeft() {
        x--; // Mengurangi nilai x untuk bergerak ke kiri
    }
    
    // Method moveRight
    public void moveRight() {
        x++; // Menambah nilai x untuk bergerak ke kanan
    }
    
    // Method moveUp
    public void moveUp() {
        y++; // Menambah nilai y untuk bergerak ke atas
    }
    
    // Method moveDown
    public void moveDown() {
        y--; // Mengurangi nilai y untuk bergerak ke bawah
    }
    
    // Method printPosition
    public void printPosition() {
        System.out.println("Posisi Snake: (" + x + ", " + y + ")");
    }
}

