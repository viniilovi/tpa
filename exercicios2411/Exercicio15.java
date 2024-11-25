package exercicios2411;

import java.util.Scanner;

public class Exercicio15 {
      public static void main(String[] args) {
            int i, j, temp, tam = 5;
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
                  for(j = 0; j<(tam-1); j++){
                        if(arrayA[j] > arrayA[j+1]){
                              temp = arrayA[j];
                              arrayA[j] = arrayA[j+1];
                              arrayA[j+1] = temp;
                        }
                  }
            }
            for(i = 0; i<tam; i++){
                  arrayB[i] = arrayA[i];
            }
            for(i = 0; i<tam; i++){
                  for(j = 0; j<(tam-1); j++){
                        if(arrayA[j] < arrayA[j+1]){
                              temp = arrayA[j];
                              arrayA[j] = arrayA[j+1];
                              arrayA[j+1] = temp;
                        }
                  }
            }
            for(i = 0; i<tam; i++){
                  arrayC[i] = arrayA[i];
            }

            System.out.println("O array B têm os seguintes elementos: [");

            for(i = 0; i<tam; i++){
                  if(i<(tam-1)){
                        System.out.print(arrayB[i] +", ");
                  }else{
                        System.out.print(arrayB[i] +"].\n");
                  }
            }

            System.out.println("O array C têm os seguintes elementos: [");

            for(i = 0; i<tam; i++){
                  if(i<(tam-1)){
                        System.out.print(arrayC[i] +", ");
                  }else{
                        System.out.print(arrayC[i] +"].\n");
                  }
            }

            in.close();
      }
}

