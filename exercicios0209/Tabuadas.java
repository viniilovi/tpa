package exercicios0209;

public class Tabuadas {
    public static void main(String[] args) {
		int i = 0, j = 1, n = 1, resultados;
		while(i<10) {
			while(j<11) {
			resultados = n*j;
			System.out.print(n +"*" +j +"=" +resultados +" ");
			j++;
			}
		if(n<10)
		System.out.println();
		j = 1;
		n+=1;
		i++;
		}
	}

}
