package vetores;
import java.util.Scanner;

public class Vetor4 {
      public static void main(String[] args) {
            int a[], i = 0;
            double total = 0, media = 0;
            Scanner in = new Scanner(System.in);
            a = new int[10];
            for(i = 0; i<10; i++){
                  System.out.println("Digite o valor que deseja: ");
                  a[i] = in.nextInt();
            }
            for(i = 0; i<10; i++){
                  total += a[i];
                  media = total/10;
            }
            System.out.println(media);
            in.close();
      }
}
