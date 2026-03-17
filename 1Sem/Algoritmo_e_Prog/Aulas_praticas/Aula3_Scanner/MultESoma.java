// Somar mais de duas equações matemáticas
import java.util.Scanner;
public class MultESoma {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print ("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print ("Digite o terceiro número: ");
        double terceiroNumero = scanner.nextDouble();
        double soma = primeiroNumero + segundoNumero;
        System.out.println ("Soma: " + soma);
        double mult = terceiroNumero * soma;
        System.out.println ("Valor do 3º: " + terceiroNumero + " * " + soma);
        System.out.println ("Resultado: " + mult);
        scanner.close();
    }
}