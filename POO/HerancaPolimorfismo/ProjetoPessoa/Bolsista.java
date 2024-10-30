package POO.HerancaPolimorfismo.ProjetoPessoa;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Reanovando bolsa do aluno" + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "é bolsista! Pagamento facilitado.");
    }
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
