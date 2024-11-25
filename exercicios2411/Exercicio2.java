package exercicios2411;

import java.util.Scanner;

public class Exercicio2 {
      public static void main(String[] args) {
            int i, j = 0, tam = 5, resultado = 0;
            int[] arrayA;

            arrayA = new int[tam];
            
            Scanner in = new Scanner(System.in);

            for(i = 0; i<tam; i++){
                  System.out.println("Insira o número do qual você deseja ver a tabuada:");
                  arrayA[i] = in.nextInt();
            }

            for(i = 0; i<tam; i++){
                  System.out.println("A tabuada do número "+arrayA[i]+" É:");
                  for(j = 1; j<11; j++){

                        resultado = arrayA[i] * j;

                        System.out.println(arrayA[i]+" * "+j+" = "+resultado+" ");
                  }
            }
            in.close();
      }
}
