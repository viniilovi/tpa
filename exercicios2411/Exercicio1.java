package exercicios2411;
import java.util.Scanner;

public class Exercicio1 {
      public static void main(String[] args) {
            int i, j = 0, tam = 20;
            int[] arrayA, arrayB;
            Scanner in = new Scanner(System.in);

            arrayA = new int[tam];
            arrayB = new int[tam];

            for(i = 0; i<tam; i++){
                  System.out.println("Insira um número inteiro para o array A");
                  arrayA[i] = in.nextInt();
            }
            for(i = 0; i<tam; i++){
                  if(arrayA[i] % 2 == 0){
                        arrayB[j] = arrayA[i];
                        j++;
                  }
            }
            j = 0;
            for(i = 0; i<tam; i++){
                  if(arrayA[i] % 2 != 0){
                        arrayB[(tam/2)+j] = arrayA[i];
                        j++;
                  }
            }

            System.out.print("O array B, com os números respectivamente ordenados em par e ímpar têm os elementos: [");

            for(i = 0; i<tam; i++){
                  if(i<(tam-1)){
                        System.out.print(+arrayB[i]+", ");
                  }else{
                        System.out.print(+arrayB[i]+"]."+"\n");
                  }
            }
            in.close();
      }
}
