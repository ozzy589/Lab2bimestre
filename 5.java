import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[8];
        int maior10 = 0;
        int menor10 = 0;
        int igual10 = 0;

        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número " + ": ");
            numeros[i] = teclado.nextInt();

            
            if (numeros[i] > 10) {
                maior10++;
            }
            
            else if (numeros[i] < 10) {
                menor10++;
            }
            
            else {
                igual10++;
            
                
            }
            
        }

        
        System.out.println("Resultados:");
        System.out.println("Números maiores que 10: " + maior10);
        System.out.println("Números menores que 10: " + menor10);
        System.out.println("Números iguais a 10: " + igual10);

        
    }
}
