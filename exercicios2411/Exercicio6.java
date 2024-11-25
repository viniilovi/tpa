package exercicios2411;

public class Exercicio6 {
      public static void main(String[] args) {
            int i, tam = 11;
            double[] arrayA;

            arrayA = new double[tam];

            System.out.println("O array A têm os seguintes elementos: [");

            for(i = 0; i<tam; i++){
                  arrayA[i] = Math.pow(2, i);
                  if(i<(tam-1)){
                        System.out.print(+arrayA[i]+", ");
                  }else{
                        System.out.print(+arrayA[i]+"]."+"\n");
                  }
            }
      }
}

