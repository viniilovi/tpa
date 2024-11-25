package exercicios2411;

import java.util.Scanner;

public class Exercicio11 {
      public static void main(String[] args) {
            int i, numeroPesquisa, tam = 10;
            boolean numeroCheck = false;
            int[] arrayA = {1, 6, 7, 23, 26, 30, 64, 20, 70, 80};

            Scanner in = new Scanner(System.in);

            System.out.println("Digite o número que deseja buscar no array A: ");
            numeroPesquisa = in.nextInt();

            for(i = 0; i<tam; i++){
                  if(arrayA[i] == numeroPesquisa){
                        numeroCheck = true;
                  }
            }
            if(numeroCheck == true){
                  System.out.println("O número " +numeroPesquisa +" está no array A.");
            }else{
                  System.out.println("O número " +numeroPesquisa +" não está no array A.");
            }

            in.close();
      }
}

