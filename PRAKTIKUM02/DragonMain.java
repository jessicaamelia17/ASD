public class DragonMain {
    public static void main(String[] args) {
        // Instansiasi objek dragon1 dan dragon2
        Dragon dragon1 = new Dragon(0, 0, 1);
        Dragon dragon2 = new Dragon(5, 5, 3);

        // Posisi awal
        System.out.println("Posisi awal:");
        dragon1.printStatus();
        dragon2.printStatus();

        // Gerakkan dragon1 dan dragon2
        dragon1.move(3);
        dragon2.move(2);
        dragon2.changeDirection(3);

        // Posisi setelah digerakkan
        System.out.println("\nPosisi setelah digerakkan:");
        dragon1.printStatus();
        dragon2.printStatus();
    }
}