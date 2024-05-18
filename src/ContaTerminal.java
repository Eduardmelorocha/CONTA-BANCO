import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Mensagem de boas-vindas
        System.out.println("Bem-vindo ao Edbank");
        System.out.println("Por favor, preencha seus dados");

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine(); // Leitura da agência como texto

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt(); // Leitura do número da conta como inteiro

        // Consumir a linha restante
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine(); // Leitura do nome do cliente como texto

        
        double saldo = 1500.99; // variável do saldo como decimal

        // Fechando o scanner
        scanner.close();

        // Exibindo os dados coletados
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
                .concat(agencia).concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo ").concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}
