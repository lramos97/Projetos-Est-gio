package POO.HerancaPolimorfismo.ProjetoConta;

public class ContaCorrente extends Conta {
    public ContaCorrente(String titular, String agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }

    @Override
    public String getTipoConta() {
        return "ContaCorrente";
    }

}
