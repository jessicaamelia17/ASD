import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan panjang array: ");
        int length = sc.nextInt();
        PersegiPanjang[] arrayofPersegiPanjang = new PersegiPanjang[length];
        int panjang, lebar;
        for (int i=0; i<length; i++){
            
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            arrayofPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i=0; i<length; i++){
            System.out.print("Persegi panjang ke-" + (i+1)+ ": ");
            arrayofPersegiPanjang[i].cetakInfo();
        
        }

        int a=4;
        while (a<6) {
            System.out.println(a);
            break;
        }
    }
}
