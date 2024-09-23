package Entidades;
public class ImovelComercial extends Imovel {
    private String tipoNegocio;

    public ImovelComercial(String endereco, double valor, Proprietario proprietario, String tipoNegocio) {
        super(endereco, valor, proprietario);
        this.tipoNegocio = tipoNegocio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Imóvel Comercial:");
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: " + valor);
        System.out.println("Proprietário: " + proprietario.getNome());
        System.out.println("Tipo de Negócio: " + tipoNegocio);
    }
}
