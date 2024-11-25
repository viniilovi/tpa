package exercicios2411;

import java.util.Scanner;

public class Exercicio12 {
      public static void main(String[] args) {
            int i, j, verificacao = 0, tam = 10;
            int[] arrayA;

            arrayA = new int[tam];

            Scanner in = new Scanner(System.in);

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número inteiro para o array A");
                  arrayA[i] = in.nextInt();
            }
            for(i = 0, j = 9; i<(tam/2); j--, i++){
                  if(arrayA[i] == arrayA[j]){
                        verificacao += 1;
                  }
            }
            if(verificacao == 5){

                  System.out.println("O array A pode ser considerado um número palíndromo se concatenar todos os elementos dele. Tal número seria: ");

                  for(i = 0; i<tam; i++){
                        if(i < (tam-1)){
                              System.out.print(+arrayA[i]);
                        }else{
                              System.out.print(+arrayA[i]+"."+"\n");
                        }
                  }
            }else{
                  System.out.println("O array A não pode ser considerado um número palíndromo se concatenar todos os elementos dele.");
            }

            in.close();
      }
}

