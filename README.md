# Sistema de Transações Bancárias

Este é um sistema simples de transações bancárias desenvolvido em Java. Ele permite cadastrar clientes e empresas, consultar saldos, realizar depósitos e saques, além de registrar transações entre clientes e empresas.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

1. Cadastro de novo cliente
2. Cadastro de nova empresa
3. Realização de transações
4. Saída do sistema

## Como usar

Para executar o sistema, siga estas etapas:

1. Certifique-se de ter o Java JDK instalado em seu sistema.
2. Faça o download ou clone este repositório em seu computador.
3. Navegue até o diretório raiz do projeto.
4. Compile o código-fonte usando o comando `javac *.java`.
5. Execute o programa usando o comando `java Main`.

Ao executar o programa, você será apresentado a um menu de opções. Escolha a opção desejada digitando o número correspondente e pressionando Enter.

Para realizar transações entre clientes e empresas, você precisará cadastrar pelo menos um cliente e uma empresa antes de prosseguir.

## Observações

- O sistema valida automaticamente os CPFs e CNPJs fornecidos durante o cadastro.
- As transações de saque serão realizadas apenas se houver saldo suficiente na conta.
- O sistema registra as transações realizadas e atualiza os saldos das empresas envolvidas.
- Para garantir a segurança dos dados, recomenda-se implementar um mecanismo de persistência, como armazenamento em banco de dados ou arquivos.
