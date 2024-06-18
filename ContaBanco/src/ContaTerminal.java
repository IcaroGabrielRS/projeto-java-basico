import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Double saldoConta = 1.200;

        System.out.println("Por favor, digite seu Primeiro nome !");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o número da sua Agência !");
        int numberAgencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Conta!");
        String numberConta = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numberAgencia + ", conta " + numberConta + " e seu saldo de " + saldoConta + "ja esta disponivel para saque !");
       
    }
}
