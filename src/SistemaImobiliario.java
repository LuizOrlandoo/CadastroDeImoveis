import java.util.Scanner;

import Entidades.Imovel;
import Entidades.ImovelComercial;
import Entidades.ImovelResidencial;
import Entidades.Proprietario;
import Repositórios.RepositorioImoveis;
import Repositórios.RepositorioImoveisImpl;
import Servicos.ServicoAvaliacao;
import Servicos.ServicoAvaliacaoImpl;

public class SistemaImobiliario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepositorioImoveis repositorioImoveis = new RepositorioImoveisImpl();
        ServicoAvaliacao servicoAvaliacao = new ServicoAvaliacaoImpl();
        
        boolean rodando = true;
        
        while (rodando) {
            System.out.println("\nSistema de Cadastro de Imóveis:");
            System.out.println("1 - Adicionar Imóvel Comercial");
            System.out.println("2 - Adicionar Imóvel Residencial");
            System.out.println("3 - Listar Imóveis");
            System.out.println("4 - Remover Imóvel");
            System.out.println("5 - Avaliar Imóvel");
            System.out.println("6 - Atualizar Imóvel");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Endereço do imóvel: ");
                    String enderecoComercial = scanner.nextLine();
                    
                    System.out.print("Valor do imóvel: ");
                    double valorComercial = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Nome do proprietário: ");
                    String nomeProprietarioComercial = scanner.nextLine();
                    
                    System.out.print("CPF do proprietário: ");
                    String cpfProprietarioComercial = scanner.nextLine();
                    
                    System.out.print("Tipo de negócio: ");
                    String tipoNegocio = scanner.nextLine();
                    
                    Proprietario proprietarioComercial = new Proprietario(nomeProprietarioComercial, cpfProprietarioComercial);
                    Imovel imovelComercial = new ImovelComercial(enderecoComercial, valorComercial, proprietarioComercial, tipoNegocio);
                    repositorioImoveis.adicionarImovel(imovelComercial);
                    System.out.println("Imóvel comercial adicionado com sucesso!");
                    break;
                    
                case 2:
                    System.out.print("Endereço do imóvel: ");
                    String enderecoResidencial = scanner.nextLine();
                    
                    System.out.print("Valor do imóvel: ");
                    double valorResidencial = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Nome do proprietário: ");
                    String nomeProprietarioResidencial = scanner.nextLine();
                    
                    System.out.print("CPF do proprietário: ");
                    String cpfProprietarioResidencial = scanner.nextLine();
                    
                    System.out.print("Número de quartos: ");
                    int numQuartos = scanner.nextInt();
                    scanner.nextLine();
                    
                    Proprietario proprietarioResidencial = new Proprietario(nomeProprietarioResidencial, cpfProprietarioResidencial);
                    Imovel imovelResidencial = new ImovelResidencial(enderecoResidencial, valorResidencial, proprietarioResidencial, numQuartos);
                    repositorioImoveis.adicionarImovel(imovelResidencial);
                    System.out.println("Imóvel residencial adicionado com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("\nLista de imóveis cadastrados:");
                    for (Imovel imovel : repositorioImoveis.listarImoveis()) {
                        System.out.println(imovel);
                    }
                    break;
                    
                case 4:
                    System.out.print("Digite o endereço do imóvel a ser removido: ");
                    String enderecoRemover = scanner.nextLine();
                    repositorioImoveis.removerImovel(enderecoRemover);
                    System.out.println("Imóvel removido com sucesso!");
                    break;
                    
                case 5:
                    System.out.print("Digite o endereço do imóvel a ser avaliado: ");
                    String enderecoAvaliar = scanner.nextLine();
                    Imovel imovelAvaliar = repositorioImoveis.buscarImovel(enderecoAvaliar);
                    
                    if (imovelAvaliar != null) {
                        double valorAvaliado = servicoAvaliacao.avaliarImovel(imovelAvaliar);
                        System.out.println("Valor avaliado: " + valorAvaliado);
                    } else {
                        System.out.println("Imóvel não encontrado.");
                    }
                    break;
                
                case 6:
                    System.out.print("Digite o endereço do imóvel a ser atualizado: ");
                    String enderecoAtualizar = scanner.nextLine();
                    Imovel imovelAtual = repositorioImoveis.buscarImovel(enderecoAtualizar);
                    
                    if (imovelAtual != null) {
                        System.out.println("Imóvel encontrado: ");
                        System.out.println(imovelAtual);
                        
                        System.out.print("Novo valor do imóvel: ");
                        double novoValor = scanner.nextDouble();
                        scanner.nextLine(); 
                        
                        System.out.print("Nome do proprietário: ");
                        String nomeProprietarioAtual = scanner.nextLine();
                        
                        System.out.print("CPF do proprietário: ");
                        String cpfProprietarioAtual = scanner.nextLine();
                        
                        Proprietario novoProprietario = new Proprietario(nomeProprietarioAtual, cpfProprietarioAtual);
                        
                        if (imovelAtual instanceof ImovelComercial) {
                            System.out.print("Novo tipo de negócio: ");
                            String novoTipoNegocio = scanner.nextLine();
                            ImovelComercial imovelComercialAtualizado = new ImovelComercial(enderecoAtualizar, novoValor, novoProprietario, novoTipoNegocio);
                            repositorioImoveis.atualizarImovel(imovelComercialAtualizado);
                        } else if (imovelAtual instanceof ImovelResidencial) {
                            System.out.print("Novo número de quartos: ");
                            int novoNumQuartos = scanner.nextInt();
                            scanner.nextLine(); 
                            ImovelResidencial imovelResidencialAtualizado = new ImovelResidencial(enderecoAtualizar, novoValor, novoProprietario, novoNumQuartos);
                            repositorioImoveis.atualizarImovel(imovelResidencialAtualizado);
                        }
                    } else {
                        System.out.println("Imóvel não encontrado para atualização.");
                    }
                    break;
                    
                case 7:
                    rodando = false;
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        
        scanner.close();
    }
}
