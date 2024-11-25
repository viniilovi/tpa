package exercicios2411;

import java.util.Scanner;

public class Exercicio13 {
      public static void main(String[] args) {
            int i, tam = 10;
            int[] arrayA, arrayB;

            arrayA = new int[tam];
            arrayB = new int[tam];

            Scanner in = new Scanner(System.in);

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número inteiro para o array A");
                  arrayA[i] = in.nextInt();
            }
            for(i = 0; i<tam; i++){
                  if(arrayA[i] % 2 == 0){
                        arrayB[i] = 1;
                  }else{
                        arrayB[i] = 0;
                  }
            }

            System.out.println("O array B têm os seguintes elementos: [");

            for(i = 0; i<tam; i++){
                  if(i<(tam-1)){
                        System.out.print(arrayB[i] +", ");
                  }else{
                        System.out.print(arrayB[i] +"]");
                  }
            }

            in.close();
      }
}

