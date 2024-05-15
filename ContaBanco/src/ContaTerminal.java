import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.println("Digite a agência:");
        numeroAgencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo do cliente:");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque");
    }
}