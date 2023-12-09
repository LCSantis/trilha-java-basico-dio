import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args){
    
    Scanner recebeDadosDoTerminal = new Scanner(System.in);

    System.out.println("Digite o numero da conta:");
    int numero = recebeDadosDoTerminal.nextInt();
    
    System.out.println("Digite o numero da agencia:");
    String agencia = recebeDadosDoTerminal.next();

    System.out.println("Digite o nome do cliente:");
    String nomeCliente = recebeDadosDoTerminal.next();

    System.out.println("Digete o saldo:");
    double saldo = recebeDadosDoTerminal.nextDouble();

    System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo de ").concat(String.valueOf(saldo)).concat(" já está disponível para saque"));
  }  
}