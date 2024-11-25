package exercicios2411;

import java.util.Scanner;

public class Exercicio7 {
      public static void main(String[] args) {
            int i, j, tam = 6;
            int[] arrayA, arrayB;

            Scanner in = new Scanner(System.in);

            arrayA = new int[tam];
            arrayB = new int[tam];

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número para o array A");
                  arrayA[i] = in.nextInt();
            }

            System.out.println("O array B têm os seguintes elementos: [");

            for(i = 0; i<tam; i++){
                  if(arrayA[i] == 0){
                        arrayB[i] = 1;
                  }else{
                        arrayB[i] = arrayA[i];
                        for(j = 1; j<arrayA[i]; j++){
                              arrayB[i] *= j;
                        }
                  }

                  if(i<(tam-1)){
                        System.out.print(+arrayB[i]+", ");
                  }else{
                        System.out.print(+arrayB[i]+"]."+"\n");
                  }
            }

            in.close();
      }
}

