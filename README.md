# Performance Goal - CRUD Farmacia

Este é um projeto de CRUD de farmácia desenvolvido em Java, utilizando Spring Boot, JPA, MySQL e Validation. Ele fornece endpoints REST para realizar operações CRUD em categorias e produtos.<br>

# Desafio
Desafio: "Construa a Backend para uma Farmácia com a capacidade de manipular os dados dos Produtos. Os produtos deverão estar classificados por Categoria. Esta atividade precisa ser entregue no tempo de 4 horas e 35 minutos."<br><br>
Tempo do desafio: 4h35m.<br>
Tempo de conclusão: 30m.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- Java JDK 11 ou superior
- MySQL
- Maven

## Configuração

1. Clone o repositório:

    ```bash
    git clone https://github.com/WallyssonChristian/CRUD-Farmacia
    ```

2. Configure o banco de dados no arquivo `src/main/resources/application.properties`.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost/nome_do_banco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Execute o aplicativo:

    ```bash
    mvn spring-boot:run
    ```

O aplicativo estará acessível em [http://localhost:8080](http://localhost:8080).

## Funcionalidades

- **Categorias:**
  - Listar todas as categorias
  - Obter detalhes de uma categoria específica por ID
  - Obter detalhes de uma categoria específica por Descrição
  - Criar uma nova categoria
  - Atualizar uma categoria existente
  - Excluir uma categoria

- **Produtos:**
  - Listar todos os produtos
  - Obter detalhes de um produto específico por ID
  - Obter detalhes de um produto específico por Nome
  - Criar um novo produto
  - Atualizar um produto existente
  - Excluir um produto

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
