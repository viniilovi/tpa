package exercicios0209;

import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        int i = 1, n, n1, expoente;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do número que deseja potenciar");
        n = in.nextInt();
        n1 = n;
        System.out.println("Digite o expoente do número que deseja potenciar");
        expoente = in.nextInt();
        while(i<expoente) {
            n *= n1;
            i++;
        }
        System.out.println(n1 +"^" +expoente +"=" +n);
        in.close();
    }
}
