import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu Nome! ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da sua Agencia! ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta! ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu Saldo! ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ") + conta + " e seu saldo R$" + saldo
                + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
