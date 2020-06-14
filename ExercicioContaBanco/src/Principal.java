import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("Insira uma taxa: ");
        contaCorrente.setTaxa(scanner.nextDouble());
        System.out.println("Insira um valor a depositar: ");
        contaCorrente.depositar(scanner.nextDouble());
        System.out.println("Extrato Conta corrente: " + contaCorrente.gerarExtrato());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(2000);
        System.out.println("Extrato Poupança: " + contaPoupanca.gerarExtrato());
    }
}
