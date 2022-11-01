import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        System.out.println("Por favor, digite o número da Numero de conta !");
        int numeroConta = input.nextInt();
        
        System.out.println("Por favor, digite o número da Agencia!");
        String agencia = input.nextLine();
        System.out.println("Por favor, digite o número da Nome Cliente !");

        String nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o número da Deposito !");

        float deposito = input.nextFloat();

        System.out.println(numeroConta + " " + agencia + " " + nomeCliente + " " + deposito);
    }
}
