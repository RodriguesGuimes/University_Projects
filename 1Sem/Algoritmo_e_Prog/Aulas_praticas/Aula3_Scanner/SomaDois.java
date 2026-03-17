//Ler dois números quaisquer, somar e exibir o resultado
import java.util.Scanner;
public class SomaDois{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in); //declara e instancia o Scanner
        System.out.print ("Digite o primeiro número: "); //entrada de dados e declaração das variáveis
        double primeiroNumero = scanner.nextDouble();
        System.out.print ("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();
        double soma =primeiroNumero + segundoNumero; // processamento a soma dos doubles
        System.out.println ("Soma = " + soma);//saída
        scanner.close();//libera o recurso
    }
}