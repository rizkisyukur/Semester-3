import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Row : ");
        int row = input.nextInt();
        System.out.print("Masukkan nilai Col : ");
        int col = input.nextInt();
        System.out.print("Masukkan nilai Batas : ");
        int batas = input.nextInt();
        cetakSegitigaSiku(row, col, batas);
    }

    static void cetakSegitigaSiku(int row, int col, int batas) {
        if (row <= batas) {
            if (col <= row) {
            System.out.print("* ");
            }
            if (col == row) {
                System.out.println();
                cetakSegitigaSiku(++row, 1, batas);
            }
            else {
                cetakSegitigaSiku(row, ++col, batas);
            }
        }
    }
}