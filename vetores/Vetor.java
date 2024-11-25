package vetores;
import java.util.Scanner;

public class Vetor {
      public static void main(String[] args) {
            int a[], b[], i = 0;
            Scanner in = new Scanner(System.in);
            a = new int[10];
            b = new int[10];
            for(i = 0; i<10; i++){
                  System.out.println("Digite o valor que deseja: ");
                  a[i] = in.nextInt();
                  b[i] = (i+1)*(i+1);
            }
            for(i = 0; i<10; i++){
                  System.out.println(b[i]);
            }
            in.close();
      }
}
