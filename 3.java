import java.util. Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);


	    String nome;
	    int vezes;
	    int contador = 0;
	    
	    System.out.println("Digite o nome a ser repetido" + ": ");
	    nome = teclado.nextLine();
	    
	    System.out.println("Digite o tanto de vezes a ser repetido" + ": ");
        vezes = teclado.nextInt();
        
        while (contador <= vezes){
            System.out.println(contador + ":  " + nome);
            
            contador++;
        }
	}
}