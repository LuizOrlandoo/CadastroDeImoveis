package Servicos;

import Entidades.Imovel;

public class ServicoAvaliacaoImpl implements ServicoAvaliacao {
    private static final double TAXA_AVALIACAO = 0.10;

    @Override
    public double avaliarImovel(Imovel imovel) {
        if (imovel == null) {
            throw new IllegalArgumentException("O imóvel não pode ser nulo.");
        }
        if (imovel.getValor() <= 0) {
            throw new IllegalArgumentException("O valor do imóvel deve ser positivo.");
        }
        return imovel.getValor() * (1 + TAXA_AVALIACAO);
    }
}
