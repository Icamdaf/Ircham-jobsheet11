import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
      Scanner Scan20 = new Scanner (System.in);
      System.out.print("masukkan nilai N = ");
      int N = Scan20.nextInt();

      int i = 1;
      while (i <= N) {
          int j = 1;
          while (j <= i) {
              System.out.print("*");
              j++;
          }
          System.out.println();
          i++;
      }
  }
}
    
