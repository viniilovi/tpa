package exercicios2411;

import java.util.Scanner;

public class Exercicio10 {
      public static void main(String[] args) {
            int i, j = 0, tam = 10, tamArrayIntersecao = 0;
            boolean diferenca = true;
            int[] arrayA, arrayB, arrayC, arrayTemp;

            Scanner in = new Scanner(System.in);

            arrayA = new int[tam];
            arrayB = new int[tam];
            arrayTemp = new int[tam];

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número para o array A: ");
                  arrayA[i] = in.nextInt();
            }
            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número para o array B: ");
                  arrayB[i] = in.nextInt();
            }

            for(i = 0; i<tam; i++){
                  diferenca = true;
                  for(j = 0; j<tam; j++){
                        if(arrayA[i] == arrayB[j]){
                              diferenca = false;
                              break;
                        }
                  }
                  if(diferenca == true){
                        arrayTemp[tamArrayIntersecao] = arrayA[i];
                        tamArrayIntersecao++;
                  }
            }

            if(tamArrayIntersecao == 0){
                  System.out.println("O array C não tem elementos.");
            }else{
                  arrayC = new int[tamArrayIntersecao];
                  System.out.println("O array C têm os seguintes elementos: [");
                  for(i = 0; i<tamArrayIntersecao; i++){

                        arrayC[i] = arrayTemp[i];
      
                        if(tamArrayIntersecao == 1){
                              System.out.print(+arrayC[i]+"]."+"\n");
                        }
                        else if(i<(tamArrayIntersecao-1)){
                              System.out.print(+arrayC[i]+", ");
                        }else{
                              System.out.print(+arrayC[i]+"]."+"\n");
                        }
                  }
            }
            
            in.close();
      }
}