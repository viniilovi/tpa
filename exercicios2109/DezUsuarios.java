package exercicios2109;
import java.util.Scanner;
public class DezUsuarios {
      public static void main(String[] args) {
            int idadeAtual, idadeVelha = 0, idadeNova = 0, usuarioNovo = 0, usuarioVelho = 0;
            Scanner in = new Scanner(System.in);
            for(int i = 1; i<11; i++){

                  System.out.println("Digite a idade do usuário abaixo:");
                  idadeAtual = in.nextInt();

                  if(idadeAtual < 0){
                        break;
                  }

                  for(int j = 0; j<i; j++){
                        if(idadeVelha <= idadeAtual || idadeVelha == 0){
                              idadeVelha = idadeAtual;
                              usuarioVelho = i;
                        }
                        if(idadeNova >= idadeAtual || idadeNova == 0){
                              idadeNova = idadeAtual;
                              usuarioNovo = i;
                        }
                  }
                  System.out.println("A idade do úsuario " +i+" é de: "+idadeAtual+" anos");

            }
            System.out.println("O usuário "+usuarioVelho+" é o mais velho, com " +idadeVelha+" anos de idade");
            System.out.println("O usuário "+usuarioNovo+" é o mais velho, com " +idadeNova+" anos de idade");

            in.close();
      }
      
}
