package exercicios2608;
import java.util.Scanner;
public class Exercicio2 {
	
	public static void main(String[] args) {
		int n1, n2;
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o valor que você deseja ver a tabuada:");
		n1 = in.nextInt();
		n2 = n1;
		int i = 1;
		while(i<11) {
			n1 = n2*i;
			System.out.println(n1);
			i++;
		}
		in.close();
	}
}