import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        ContaBanco contaBanco = new ContaBanco();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        contaBanco.numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome da Agência !");
        contaBanco.agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome !");
        contaBanco.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo disponível");
        contaBanco.saldo = scanner.nextFloat();

        System.out.println("Olá " + contaBanco.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaBanco.agencia + ", conta " + contaBanco.numero + " e seu saldo " + contaBanco.saldo + " já está disponível para saque.");


    }
}
