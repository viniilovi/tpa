package exercicios2411;

import java.util.Scanner;

public class Exercicio4 {
      public static void main(String[] args) {
            int i, j, tam = 10;
            int[] arrayA;

            Scanner in = new Scanner(System.in);

            arrayA = new int[tam];

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número inteiro para o array A");
                  arrayA[i] = in.nextInt();
            }
            for(i = 0; i<tam; i++){
                  System.out.println("O número " +arrayA[i]+" da posição "+(i+1)+" tem os seguintes números pares antes dele:");
                  for(j = 0; j<(arrayA[i]+1); j += 2){
                        System.out.println(j);
                  }
            }
            in.close();
      }
}

