package exercicios2411;

import java.util.Scanner;

public class Exercicio5 {
      public static void main(String[] args) {
            int i, j, quociente, tam = 10;
            int[] arrayA;

            Scanner in = new Scanner(System.in);

            arrayA = new int[tam];

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número inteiro para o array A");
                  arrayA[i] = in.nextInt();
            }
            for(i = 0; i<tam; i++){
                  System.out.println("O número " +arrayA[i]+" da posição "+(i+1)+" tem os seguintes divisores:");
                  if(arrayA[i] > -1){
                        for(j = 1; j<(arrayA[i]+1); j++){
                              quociente = arrayA[i] % j;
                              if(quociente == 0){
                                    System.out.println(j);
                              }
                        }
                  }else{
                        arrayA[i] *= -1;
                        for(j = 1; j<(arrayA[i]+1); j++){
                              quociente = arrayA[i] % j;
                              if(quociente == 0){
                                    System.out.println(j);
                                    System.out.println(-j);
                              }
                        }   
                  }
            }
            in.close();
      }
}

