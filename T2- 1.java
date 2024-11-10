import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	    String nome;
	    int contador = 0;
	    
	    System.out.println("Digite seu Nome:   ");
	    nome = teclado.nextLine();
	    
	    while(contador < 25){
	        System.out.println("SEU NOME" + ":   " + nome);
	       contador++;
	    }
		
		    
	}
}
	
