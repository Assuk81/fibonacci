//Juan Carlos Corredor Sánchez 
//https://github.com/Assuk81/fibonacci.git

package claseDia15;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int anteriorMenosUno=0;
		int anterior=1;
		int resultado=0;
		int numUsuario=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué posición de sucesión de Fibonacci quieres saber?");
		numUsuario =sc.nextInt();
		for (int i = 0; i < numUsuario-2; i++) {
			resultado=anterior+anteriorMenosUno;
			anteriorMenosUno=anterior;
			anterior=resultado;
			
		}
		sc.close();
		
		//resultado = (num-1)+(num-2);
		System.out.println("El resultado es: " + resultado);
		
		
	}

}
