package POO.HerancaPolimorfismo.ProjetoConta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, String agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }
    private void calculoRendimento() {
        double rendimento = this.getSaldo() * 0.1;
        this.saldo = this.getSaldo();
        saldo += rendimento;
        System.out.println("Seu rendimento de 10% é de: " + rendimento);
        System.out.println("Seu saldo com rendimento é de: " + this.saldo);
    }
    public void getCalculoRendimento(){
        calculoRendimento();
    }

    @Override
    public String getTipoConta() {
        return "ContaPoupanca";
    }

}

