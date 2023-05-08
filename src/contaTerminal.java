import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero da agencia: ");
        agencia = scan.next();
        System.out.println("Digite o numero da conta");
        nuConta = scan.nextInt();
        System.out.println("Ola! " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agengia é "
                + agencia + ", conta " + nuConta + " é seu saldo de R$ " + saldo
                + "reais já está disponível para saque.");
    }

    static String nomeCliente = "Anderson Luiz";
    static String agencia = "067-8";
    static int nuConta = 1021;
    static double saldo = 600.00;
}
