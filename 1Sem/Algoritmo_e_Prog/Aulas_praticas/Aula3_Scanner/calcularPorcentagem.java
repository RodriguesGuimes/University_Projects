//Fazer em casa: Ler um valor, calcular 10% e exibir.
import java.util.Scanner;
public class calcularPorcentagem {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Coloque um valor: ");
        double valorUnico = scanner.nextDouble();
        System.out.println ("Calcular: 10% do valor " + valorUnico);
        double calPorcentagem = valorUnico * 10 / 100;
        System.out.println ("Resultado: " + calPorcentagem);
        scanner.close();
    }
}
