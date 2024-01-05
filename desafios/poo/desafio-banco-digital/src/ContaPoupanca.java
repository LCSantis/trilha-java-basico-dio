
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, int senha) {
        super(cliente, senha);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
    }
}
