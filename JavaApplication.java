import java.util.Scanner;
public class JavaApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai faktorial (n!) : ");
        int n = input.nextInt();
        int hasil = rekursif(n);
        System.out.print(hasil);
    }
    
    public static Integer rekursif(int n){
        if(n == 0 || n == 1){
            return 1;
            }else{
            return n* rekursif(n-1);
        }
    }
}
    