#Sistema de Transações Bancárias

Este é um sistema simples de transações bancárias desenvolvido em Java. Ele permite cadastrar clientes e empresas, consultar saldos, realizar depósitos e saques, além de registrar transações entre clientes e empresas.

#Funcionalidades

O sistema possui as seguintes funcionalidades:

Cadastro de novo cliente
Cadastro de nova empresa
Consulta de saldo de empresa
Realização de transações
Consulta de clientes cadastrados
Consulta de empresas cadastradas
Saída do sistema

#Como usar

Para executar o sistema, siga estas etapas:

Certifique-se de ter o Java JDK instalado em seu sistema.
Faça o download ou clone este repositório em seu computador.
Navegue até o diretório raiz do projeto.
Compile o código-fonte usando o comando javac *.java.
Execute o programa usando o comando java Main.
Ao executar o programa, você será apresentado a um menu de opções. Escolha a opção desejada digitando o número correspondente e pressionando Enter.

Para realizar transações entre clientes e empresas, você precisará cadastrar pelo menos um cliente e uma empresa antes de prosseguir.

#Observações

O sistema valida automaticamente os CPFs e CNPJs fornecidos durante o cadastro.
As transações de saque serão realizadas apenas se houver saldo suficiente na conta.
O sistema registra as transações realizadas e atualiza os saldos das empresas envolvidas.
Para garantir a segurança dos dados, recomenda-se implementar um mecanismo de persistência, como armazenamento em banco de dados ou arquivos.
