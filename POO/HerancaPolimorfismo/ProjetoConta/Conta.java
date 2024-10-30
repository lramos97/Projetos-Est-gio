package POO.HerancaPolimorfismo.ProjetoConta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements ContaBanco {
    private String titular;
    private String agencia;
    private int numero;
    protected double saldo;
    private LocalDateTime dataAbertura;

    public Conta(String titular, String agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = java.time.LocalDateTime.now();
    }

    public String getDataAberturaFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataAbertura.format(formatter);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public String getTipoConta;


    @Override
    public String recuperarDadosImpressao() {
        return
                System.out.printf("""
                        ======================================
                        TITULAR =  %s
                        AGÊNCIA = %s
                        NÚMERO = %d
                        SALDO = %.2f
                        DATA DE ABERTURA = %s
                        ======================================
                        """, titular, agencia, numero, saldo, getDataAberturaFormatada()).toString();
    }

    @Override
    public void checarSaldo() {

        System.out.println("Saldo atual: " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Saldo atual: " + this.saldo);

    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saldo atual: " + this.saldo);
        }
        System.out.println("Saldo insuficiente");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + contaDestino.getTitular());
            System.out.println();
            System.out.println("CONTA ORIGEM");
            System.out.println("Saldo atual: " + saldo);
            System.out.println("============================");
            System.out.println("CONTA DESTINO");
            contaDestino.depositar(valor);

        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido.");
        }
    }
}
