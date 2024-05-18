import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Para continuar preencha os dados abaixo:");

            System.out.printf("Digite o numero da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.printf("Digite qual a agencia: ");
            String agencia = scanner.next();

            System.out.printf("Digite o nome do cliente: ");
            String nome = scanner.next();

            System.out.printf("Digite o saldo da conta");
            double saldo = scanner.nextDouble();

            System.out.println();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " 
            + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");

            scanner.close();
        }
}
