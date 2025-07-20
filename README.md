# wsend

Este projeto utiliza o Quarkus

## Executando a aplicação em modo de desenvolvimento

Você pode executar sua aplicação em modo de desenvolvimento, que permite live coding, usando:

```shell script
./gradlew quarkusDev
```

## Arquitetura do Projeto

A arquitetura do projeto segue os princípios do DDD (Domain-Driven Design), organizando o código em camadas que refletem as responsabilidades do domínio:

- **domain**: Contém o núcleo das regras de negócio, incluindo entidades, agregados, objetos de valor, repositórios (interfaces) e serviços de domínio.
- **application**: Responsável pelos casos de uso (orquestração de regras de negócio), DTOs, mapeamentos e lógica de aplicação.
- **infrastructure**: Implementa os detalhes técnicos, como persistência, integrações externas, adaptadores de entrada (REST, WebSocket) e saída, além das configurações necessárias.
- **shared**: Inclui utilitários e tratamento de exceções comuns a todo o projeto.

## Fluxo da Aplicação

O fluxo típico de uma requisição na aplicação segue os princípios do DDD e ocorre da seguinte forma:

1. **Entrada**: Uma requisição chega por meio de um adaptador de entrada, como um endpoint REST ou WebSocket, localizado na camada `infrastructure`.
2. **DTOs e Mapeamento**: Os dados recebidos são convertidos para DTOs e, em seguida, mapeados para objetos do domínio pela camada `application`.
3. **Casos de Uso**: A camada `application` orquestra o processamento, chamando os casos de uso que encapsulam a lógica de aplicação.
4. **Domínio**: Os casos de uso interagem com as entidades, agregados e serviços de domínio presentes na camada `domain`, aplicando as regras de negócio.
5. **Persistência/Integrações**: Quando necessário, a camada `domain` utiliza interfaces de repositório, que são implementadas na camada `infrastructure` para acessar bancos de dados ou serviços externos.
6. **Resposta**: O resultado é convertido novamente em DTOs de resposta pela camada `application` e retornado ao adaptador de entrada, que envia a resposta ao cliente.

Esse fluxo garante separação de responsabilidades, facilitando manutenção, testes e evolução do sistema.
