package Entidades;
public abstract class Imovel {
    protected String endereco;
    protected double valor;
    protected Proprietario proprietario;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Imovel(String endereco, double valor, Proprietario proprietario) {
        this.endereco = endereco;
        this.valor = valor;
        this.proprietario = proprietario;
    }

    public abstract void exibirDetalhes();
}
