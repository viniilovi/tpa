package exercicios2411;

import java.util.Scanner;

public class Exercicio3 {
      public static void main(String[] args) {
            int i, j = 0, tam = 10, quociente = 1;
            int[] arrayA;

            arrayA = new int[tam];
            
            Scanner in = new Scanner(System.in);

            for(i = 0; i<tam; i++){
                  System.out.println("Insira os números que irão fazer parte do array A.");
                  arrayA[i] = in.nextInt();
            }

            for(i = 0; i<tam; i++){
                  if(arrayA[i] < 2){
                        System.out.println("O número "+arrayA[i]+ " da posição " +(i+1) +" não é primo.");
                  }else{
                        for(j = 2; j<arrayA[i]; j++){
                              quociente = arrayA[i] % j;

                              if(quociente == 0){
                                    System.out.println("O número "+arrayA[i]+ " da posição " +(i+1) +" não é primo.");
                                    break;
                              }
                        }
                        if(quociente != 0){
                              System.out.println("O número"+arrayA[i]+ " da posição " +(i+1) +" é primo.");
                        }

                  }
            }
            in.close();
      }
}
