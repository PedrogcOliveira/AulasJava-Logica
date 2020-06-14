public class ContaPoupanca extends Conta {

    private double taxa;

    public ContaPoupanca() {
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double sacar(double valor) {
        return this.saldo = this.saldo - valor  ;
    }

    @Override
    public double depositar(double valor) {
        return this.saldo = this.saldo + valor;
    }

    public double gerarExtrato() {
        return this.saldo * 1.04;
    }


}
