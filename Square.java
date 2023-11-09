import java.util.Scanner;
public class Square {

    public static void main(String[] args) {
     Scanner Scan20 = new Scanner(System.in);

   System.out.print("Masukkan nilai n = ");
   int N = Scan20.nextInt();
  for ( int iOuter = 1; iOuter <= N; iOuter++ ) {
     for (int i = 0; i <= N; i++) {
    System.out.print("*");
   }
System.out.println();
}
   
   
    }
}