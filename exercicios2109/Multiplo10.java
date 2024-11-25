package exercicios2109;

public class Multiplo10 {
      public static void main(String[] args) {
            int reserva, resultado = 10; 
            for(int i = 1; i<101; i++){
                  reserva = i;
                  reserva %= resultado;
                  if(reserva == 0){
                        System.out.printf("%n"+i+ " É um múltiplo de 10." +"%n");
                        resultado += 10;
                  }else{
                        System.out.print(i +" ");
                  }
            }
      }
}
