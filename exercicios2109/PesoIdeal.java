package exercicios2109;
import java.util.Scanner;
public class PesoIdeal {
      public static void main(String[] args) {
            int i = 1;
            String sexo;
            double altura, pesoIdeal;
            Scanner in = new Scanner(System.in);
            do{
                  System.out.println("Digite o sexo do usuário, Feminino ou Masculino.");
                  sexo = in.next();
                  System.out.println("Digite a altura do usuário.");
                  altura = in.nextDouble();
                  if(sexo.equalsIgnoreCase("Feminino")){
                        pesoIdeal = 52 + (0.67 * (altura-152.4));
                        System.out.println("O peso ideal do usuário é de: "+pesoIdeal+"kg");
                  }else if(sexo.equalsIgnoreCase("Masculino")){
                        pesoIdeal = 52 + (0.75 * (altura-152.4));
                        System.out.println("O peso ideal do usuário é de: "+pesoIdeal+"kg");
                  }else{
                        System.out.println("Por favor digite Feminino ou Masculino na próxima vez que executar o programa.");
                  }
                  System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
                  i = in.nextInt();
            }
            while (i == 1);




            in.close();
      }
}

