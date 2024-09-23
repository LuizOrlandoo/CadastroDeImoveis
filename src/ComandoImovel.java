import Entidades.Imovel;

public class ComandoImovel {
    private String tipoComando;
    private Imovel imovel;

    public ComandoImovel(String tipoComando, Imovel imovel) {
        this.tipoComando = tipoComando;
        this.imovel = imovel;
    }

    public String getTipoComando() {
        return tipoComando;
    }

    public Imovel getImovel() {
        return imovel;
    }
}
