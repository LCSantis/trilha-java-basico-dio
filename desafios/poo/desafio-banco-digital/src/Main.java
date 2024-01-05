
public class Main {

    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas, 123456);
        Conta poupanca = new ContaPoupanca(lucas, 987654);

        //cc.depositar(100);
        //cc.transferir(100, poupanca);
        //poupanca.transferir(50, cc);

        //cc.imprimirExtrato();
        //poupanca.imprimirExtrato();
    }

}
