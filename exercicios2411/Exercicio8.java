package exercicios2411;

import java.util.Scanner;

public class Exercicio8 {
      public static void main(String[] args) {
            int i, j = 0, tam = 10;
            double[] arrayA, arrayB;

            Scanner in = new Scanner(System.in);

            arrayA = new double[tam];
            arrayB = new double[tam];

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número para o array A");
                  arrayA[i] = in.nextDouble();
            }

            System.out.println("O array B têm os seguintes elementos: [");

            for(i = 0; i<(tam); i++){
                  for(j = 0;j<=i; j++){
                        arrayB[i] += arrayA[j];
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

