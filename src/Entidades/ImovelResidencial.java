package Entidades;
public class ImovelResidencial extends Imovel {
    private int numeroQuartos;

    public ImovelResidencial(String endereco, double valor, Proprietario proprietario, int numeroQuartos) {
        super(endereco, valor, proprietario);
        this.numeroQuartos = numeroQuartos;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Imóvel Residencial:");
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: " + valor);
        System.out.println("Proprietário: " + proprietario.getNome());
        System.out.println("Número de Quartos: " + numeroQuartos);
    }
}
