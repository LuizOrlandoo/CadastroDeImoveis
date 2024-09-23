package Repositórios;
import java.util.ArrayList;
import java.util.List;

import Entidades.Imovel;

public class RepositorioImoveisImpl implements RepositorioImoveis {
    private List<Imovel> imoveis;

    public RepositorioImoveisImpl() {
        this.imoveis = new ArrayList<>();
    }

    @Override
    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    @Override
    public Imovel buscarImovel(String endereco) {
        for (Imovel imovel : imoveis) {
            if (imovel.getEndereco().equalsIgnoreCase(endereco)) {
                return imovel;
            }
        }
        return null;
    }

    @Override
    public void atualizarImovel(Imovel imovelAtualizado) {
        for (int i = 0; i < imoveis.size(); i++) {
            Imovel imovel = imoveis.get(i);
            
            if (imovel.getEndereco().equalsIgnoreCase(imovelAtualizado.getEndereco())) {
                imoveis.set(i, imovelAtualizado);
                System.out.println("Imóvel atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Imóvel não encontrado para atualização.");
    }

    @Override
    public void removerImovel(String endereco) {
        boolean removido = imoveis.removeIf(imovel -> imovel.getEndereco().equalsIgnoreCase(endereco));
        if (removido) {
            System.out.println("Imóvel removido com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    @Override
    public List<Imovel> listarImoveis() {
        return imoveis;
    }
}
