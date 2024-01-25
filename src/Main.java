import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Latihan Fibonacci ");

        int A = 1 ;
        int B = 0 ;
        int HASIL ;
        int Akhir ;
        int Temp = 1;

        Scanner InputUser = new Scanner(System.in);

        System.out.print(" Masukkan Berapa Baris : ");
        Akhir = InputUser.nextInt() ;

        while ( Akhir >= 1 ){

            HASIL = A + B ;

            System.out.println(" Fibonacci Ke-" + Temp + " = " + A + " + " + B  + " = " + HASIL ) ;

            B = A ;
            A = HASIL ;


            Temp++ ;
            Akhir-- ;
        }
    }
}