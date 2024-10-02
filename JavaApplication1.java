import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak deret fibonacci (dalam angka) : ");
        int banyak = input.nextInt();
        for (int i = 0; i < banyak; i++) {
            int hasil = fiboRekursif(i);
            System.out.print(hasil + " ");
        }
    }
    
    public static Integer fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
            return fiboRekursif(n - 1) + fiboRekursif(n - 2);
        }
    }
    