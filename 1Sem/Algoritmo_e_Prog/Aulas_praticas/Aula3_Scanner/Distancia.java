// transformar uma distancia em milhas
import java.util.Scanner;
public class Distancia {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o km: ");
        double distanciaKM = scanner.nextDouble();
        double milhas = distanciaKM / 1.61;
        System.out.println("Transforma KM para milhas: " + distanciaKM + " / " + "Milhas");
        System.out.println("Milhas: " + milhas);
        scanner.close();
    }
}