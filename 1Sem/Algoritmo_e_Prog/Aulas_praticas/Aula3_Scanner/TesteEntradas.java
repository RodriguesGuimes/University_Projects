import java.util.Scanner;
public class TesteEntradas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declarando e instanciando um objeto Scanner
        System.out.print ("Digite um inteiro: "); //Exibe mensagem para o usuario
        int valorInteiro = scanner.nextInt(); //Declara um inteiro e faz a leitura
        System.out.print ("Digite um valor com casas decimais: "); 
        double valorDecimal = scanner.nextDouble();//Declara um valor decimal e faz a leitura
        System.out.print ("Digite verdadeiro (true) ou falso (false): ");
        boolean eVerdade = scanner.nextBoolean(); // Declara um valor verdadeiro ou falso
        System.out.println ("Vejas os valores digitados: "); // Exibir os valores digitados
        System.out.println ("o Inteiro: " + valorInteiro);
        System.out.println ("o Decimal: " + valorDecimal);
        System.out.println ("o Valor Verdade: " +eVerdade);
        scanner.close(); //Liberar o recurso
      
}
}