import java.util. Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);


		int cont = 1;
		int mult = 5;
		int resultado;

		while(cont <= 10) {
			resultado = mult * cont;

			System.out.println(mult + "X" + cont + ": " + resultado);

			cont++;



		}



	}
}