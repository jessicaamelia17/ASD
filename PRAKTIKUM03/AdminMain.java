import java.util.Scanner;

public class AdminMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin[] adminArray = new Admin[2];

        for (int i = 0; i < adminArray.length; i++) {
            System.out.println("Masukkan data admin ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            adminArray[i] = new Admin(nama, password);
        }
        for (int i = 0; i < adminArray.length; i++) {
            System.out.println("Masukkan data admin ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            adminArray[i] = new Admin(nama, password);
        }

        for (int i = 0; i < adminArray.length; i++) {
            System.out.println("\nAdmin ke-" + (i + 1) + " Login");
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            adminArray[i].login(username, password);
        }

    }
}
