
public class SnakeMain {
    public static void main(String[] args) {
        // Instansiasi objek snake1 dan snake2
        Snake snake1 = new Snake(0, 0);
        Snake snake2 = new Snake(2, 6);
        
        // Posisi awal
        System.out.println("Posisi awal:");
        snake1.printPosition();
        snake2.printPosition();
        
        // Gerakkan snake1
        snake1.moveRight();
        snake1.moveUp();
        
        // Gerakkan snake2
        snake2.moveLeft();
        snake2.moveDown();
        snake2.moveLeft();
        
        // Posisi setelah digerakkan
        System.out.println("\nPosisi setelah digerakkan:");
        snake1.printPosition();
        snake2.printPosition();
    }
}
