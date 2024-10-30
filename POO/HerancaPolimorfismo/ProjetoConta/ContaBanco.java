package POO.HerancaPolimorfismo.ProjetoConta;

public interface ContaBanco {
    public abstract String getTipoConta();

    public abstract String recuperarDadosImpressao();

    public abstract void checarSaldo();

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public abstract void transferir(double valor, Conta contaDestino);
}
