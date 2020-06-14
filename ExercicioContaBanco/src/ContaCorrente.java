public class ContaCorrente extends Conta {

    private double taxa;

    public ContaCorrente() {
        this.taxa = 0.25;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double sacar(double valor) {
        return this.saldo = this.saldo - valor - this.taxa;
    }

    @Override
    public double depositar(double valor) {
        return this.saldo = this.saldo + valor - this.taxa;
    }

    public double gerarExtrato() {
        return this.saldo;
    }
}
