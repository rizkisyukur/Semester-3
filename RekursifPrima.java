import java.util.Scanner;

public class RekursifPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicek : ");
        int bil = input.nextInt();
        int i = 2;
        boolean hasil = primaRekursif(bil, i);
        if(hasil == true){
            System.out.println("Bilangan Tersebut adalah prima!");
        }else {
            System.out.println("Bilangan Tersebut bukan Prima!");
        }

        

    }

    public static boolean primaRekursif(int bil,int i){
        
        if(bil==2){
            return true;
        }
        if (bil%i == 0){
            return false;
        }
        else{
            return primaRekursif(bil, i);
        }
        

    }
}
