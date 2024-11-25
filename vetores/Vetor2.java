package vetores;
import java.util.Scanner;

public class Vetor2 {
      public static void main(String[] args) {
            int a[], b[], c[], i = 0;
            Scanner in = new Scanner(System.in);
            a = new int[10];
            b = new int[10];
            c = new int[10];
            for(i = 0; i<10; i++){
                  System.out.println("Digite o valor do vetor A que deseja: ");
                  a[i] = in.nextInt();
            }
            for(i = 0; i<10; i++){
                  System.out.println("Digite o valor do vetor B que deseja: ");
                  b[i] = in.nextInt();
            }
            for(i = 0; i<10; i++){
                  c[i] = a[i] + b[i];
                  System.out.println(c[i]);
            }
            in.close();
      }
}
