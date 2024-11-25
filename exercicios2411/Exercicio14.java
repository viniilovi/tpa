package exercicios2411;

import java.util.Scanner;

public class Exercicio14 {
      public static void main(String[] args) {
            int i, tam = 10;
            int[] arrayA, arrayB, arrayC;

            arrayA = new int[tam];
            arrayB = new int[tam];
            arrayC = new int[tam];

            Scanner in = new Scanner(System.in);

            

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número inteiro para o array A");
                  arrayA[i] = in.nextInt();
            }


            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número inteiro para o array B");
                  arrayB[i] = in.nextInt();
            }
            for(i = 0; i<tam; i++){
                  if(arrayA[i] < arrayB[i]){
                        arrayC[i] = -1;
                  }else if(arrayA[i] == arrayB[i]){
                        arrayC[i] = 0;
                  }else{
                        arrayC[i] = 1;
                  }
            }

            System.out.println("O array C têm os seguintes elementos: [");

            for(i = 0; i<tam; i++){
                  if(i<(tam-1)){
                        System.out.print(arrayC[i] +", ");
                  }else{
                        System.out.print(arrayC[i] +"].");
                  }
            }

            in.close();
      }
}

