import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        //Variáveis
        int numero;
        String Agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("-----Bem vindo ao Banco xyz-----");
        System.out.print("Por favor, informe o numero da conta: ");
        numero = scanner.nextInt();
        System.out.print("Por favor, informe o numero da agência: ");
        Agencia = scanner.next();
        System.out.print("Digite seu nome e sobrenome: ");
        nomeCliente = scanner.next();
        System.out.print("Digite seu saldo: ");
        saldo = scanner.nextDouble();
        System.out.println("=================================");
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: [" + Agencia + "], conta: [" + numero + "], e seu saldo é de R$" + saldo + " Disponível para saque.");


    }
}
