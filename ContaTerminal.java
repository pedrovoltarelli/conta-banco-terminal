package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Terminal do Santander.");
        System.out.println("Por favor, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Agora digite os quatro números finais da sua conta: ");
        String contaAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        double salarioConta = scanner.nextDouble();

        scanner.close();
        System.out.println("Olá, "+nomeCliente+". Obrigado por criar uma conta em nosso banco. Sua agência é: "+numeroAgencia+", numero: "+contaAgencia+", e seu saldo é de: "+salarioConta);
    }
}