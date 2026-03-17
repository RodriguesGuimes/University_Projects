//Calculadora de velocidade media
import java.util.Scanner;
public class Exercicio1 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite KM percorrido: ");
        double quilometroPercorrido = leitor.nextDouble();
        System.out.print("Digite as horas gastas: ");
        double horasGastas = leitor.nextDouble();
        System.out.println("Calucular velocidade Media: " + quilometroPercorrido + "/" + horasGastas);
        double somaMedia = quilometroPercorrido / horasGastas;
        System.out.println("Velocidade Media = " + somaMedia);
        leitor.close();
    }
}