# Sistema de Cadastro de Imóveis

Este **Sistema de Cadastro de Imóveis** tem como objetivo permitir que o usuário gerencie atividades com relação a imóveis comerciais e residenciais. 

### Funcionalidades

O sistema oferece as funcionalidades de CRUD (Create, Read, Update, Delete), como também, avaliação de imóveis. Ele permite:

- **Cadastrar Imóvel**

Ele permite cadastrar dois tipos de imóvel: Residencial e Comercial. Quando um imóvel é adicionado, o usuário deve fornecer alguns dados como nome e cpf do proprietário, endereço, o valor do imóvel e o tipo de negócio.

- **Listar Imóveis**

Ao escolher essa opção, o sistema exibe uma lista com os imóveis cadastrados, incluindo as informações do imóvel.

- **Remover Imóvel**

Esta opção permite remover um imóvel do sistema, utilizando o endereço para identificá-lo. Após isso, o imóvel não estará mais disponível na lista.

- **Avaliar Imóvel**

  O sistema aplica uma taxa de 10% acima do valor original do imóvel. O usuário digita o endereço do imóvel que deseja fazer a avaliação de preço e o sistema atualiza o valor após essa avaliação.

- **Atualizar Imóvel**

Quando o usuário seleciona essa opção, o sistema pede que o usuário informe qual imóvel será atualizado, utilizando o endereço do imóvel para identificá-lo. Ao ser identificado, as novas informações do imóvel podem ser inseridas.

### Entidades

- **Cliente:** Representa um cliente que está interessado em comprar ou alugar um imóvel.

- **Proprietário:** Representa o proprietário de um imóvel.
  
- **Imóvel:** Uma classe abstrata que representa um imóvel.

- **Imóvel Comercial:** Uma subclasse da classe **Imóvel** que representa um imóvel comercial.

- **Imóvel Residencial:** Uma subclasse da classe **Imóvel** que representa um imóvel residencial.

  ### Implementações

  - **RepositorioImoveisImpl:** Classe utilizada para implementar a interface **RepositorioImoveis**, que serve para gerenciar a lista de imóveis.
 
  -  **ServicoAvaliacaoImpl:** Classe utilizada para implementar a interface **ServicoAvaliacao**, que aplica uma taxa de avaliação sobre o valor do imóvel.
 
  ### Como Interagir com o Sistema

  Após dar início no sistema, o menu será exibido mostrando as opções de uso. As opções são:

  1- **Adicionar Imóvel Comercial:** Cadastra um novo imóvel comercial.
  Ao escolher essa opção, o sistema pede os dados do imóvel (Endereço, Valor, Nome do proprietário, Cpf do proprietário e Tipo de negócio). Depois de serem preenchidos os campos com cada uma das informações pedidas, o imóvel é adicionado.

  2- **Adicionar Imóvel Residencial:** Cadastra um novo imóvel residencial.
  Ao escolher essa opção, o sistema fará o mesmo que o imóvel comercial, pedindo os dados do imóvel (Endereço, Valor, Nome do proprietário, Cpf do proprietário e Número de quartos). Ao preencher os campos com cada informação pedida, o imóvel será adicionado.

  3- **Listar Imóveis:** Exibe uma lista com os imóveis cadastrados.
  Ao escolher essa opção, uma lista com todos os imóveis cadastrados será exibida.

  4- **Remover Imóvel:** Permite o usuário remover um imóvel do sistema.
  Selecionando essa opção, o sistema pede que o usuário informe o endereço do imóvel a ser removido. Ao informar o endereço, o imóvel relacionado a esse endereço é removido do sistema.

  5- **Avaliar Imóvel:** Avalia o imóvel, colocando uma taxa de 10% sobre o valor inicial.
  Ao selecionar essa opção, o sistema pede o endereço do imóvel a ser avaliado. O serviço recebe o endereço do imóvel e aplica uma lógica de cálculo em relação ao valor base do imóvel. Isso serve para o usuário obter uma estimativa do valor de um imóvel.

  6- **Sair:** Ao escolher essa opção, o sistema é encerrado.
