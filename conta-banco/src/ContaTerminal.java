import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numeroConta;
        String nomeCliente;
        double saldoConta;
        String agencia;
        
        System.out.println("Digite o número da conta");
        numeroConta = scan.nextInt();

        System.out.println("Digite o nome do cliente");
        nomeCliente = scan.nextLine(); 
        scan.nextLine();

        System.out.println("Digite o número da agencia");
        agencia = scan.nextLine();
        //scan.nextLine();

        System.out.println("Digite o saldo da conta");
        saldoConta = scan.nextDouble();

        System.out.println("Olá " + nomeCliente 
        + ", obrigado por criar uma conta no nosso banco, sua agência é " 
        + agencia + ", conta " + numeroConta 
        + " e seu saldo é " + saldoConta 
        + " já está disponivel.");


    }// fim main
}// fim classe 
