package exercicios2608;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		int anoNasc, anoAtual, idade;
		Scanner in = new Scanner(System.in);
		int i = 1;
		while (i<7) {
		System.out.println("Insira o ano de nascimento do usu�rio");
		anoNasc = in.nextInt();
		System.out.println("Insira o ano atual");
		anoAtual = in.nextInt();
		idade = (anoAtual - anoNasc);
		if(idade>=18) {
			System.out.println("O Usu�rio � maior de idade");
		}else {
			System.out.println("O Usu�rio � menor de idade");
		}
		i++;
		}
	in.close();
	}
}
