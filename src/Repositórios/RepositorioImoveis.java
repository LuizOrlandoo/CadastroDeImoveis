package Repositórios;
import java.util.List;

import Entidades.Imovel;

public interface RepositorioImoveis {
    void adicionarImovel(Imovel imovel);
    Imovel buscarImovel(String endereco);
    void atualizarImovel(Imovel imovel);
    void removerImovel(String endereco);
    List<Imovel> listarImoveis();
}
