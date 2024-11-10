import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	    int cont = 1;
	    int mult = 1;
	    
	    
	    System.out.println("Digite um numero de 1 a 10");
	    cont = teclado.nextInt();
	    
	    for(int i = 1; i < 10; i++){
	        int resultado = cont * i;
	         System.out.println(cont + "x" + i + "  =  " + resultado);
	    }
	       
	      
	       
	    }
	}

	
