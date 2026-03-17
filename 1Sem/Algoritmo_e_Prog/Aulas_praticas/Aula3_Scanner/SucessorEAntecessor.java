// Ver o antecessor ou o sucessor de um numero
import java.util.Scanner;
public class SucessorEAntecessor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digitar um numero: ");
        int Numero = scanner.nextInt();
        int sucessor = Numero + 1;
        int antecessor = Numero - 1;
        System.out.println ("Sucessor: " + sucessor);
        System.out.println ("Antecessor: " + antecessor);
        scanner.close();
    }
}
