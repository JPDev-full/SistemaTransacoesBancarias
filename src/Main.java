import entities.Cliente;
import entities.Empresa;
import entities.Transacao;
import services.BancoDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoDados bancoDados = new BancoDados();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar novo cliente");
            System.out.println("2. Cadastrar nova empresa");
            System.out.println("3. Realizar transação");
            System.out.println("4. Sair");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    String cpf = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, cpf);
                    bancoDados.adicionarCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome da empresa:");
                    String nomeEmpresa = scanner.nextLine();
                    System.out.println("Digite o CNPJ da empresa:");
                    String cnpj = scanner.nextLine();
                    Empresa empresa = new Empresa(nomeEmpresa, cnpj);
                    bancoDados.adicionarEmpresa(empresa);
                    System.out.println("Empresa cadastrada com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o CPF do cliente:");
                    String cpfCliente = scanner.nextLine();
                    Cliente clienteTransacao = bancoDados.buscarClientePorCPF(cpfCliente);
                    if (clienteTransacao == null) {
                        System.out.println("Cliente não encontrado.");
                        break;
                    }
                    System.out.println("Digite o CNPJ da empresa:");
                    String cnpjEmpresa = scanner.nextLine();
                    Empresa empresaTransacao = bancoDados.buscarEmpresaPorCNPJ(cnpjEmpresa);
                    if (empresaTransacao == null) {
                        System.out.println("Empresa não encontrada.");
                        break;
                    }
                    System.out.println("Digite o valor da transação:");
                    double valorTransacao = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite o tipo da transação (depósito ou saque):");
                    String tipoTransacao = scanner.nextLine();
                    Transacao transacao = new Transacao(clienteTransacao, empresaTransacao, valorTransacao, tipoTransacao);
                    boolean transacaoRealizada = bancoDados.realizarTransacao(transacao);
                    if (transacaoRealizada) {
                        System.out.println("Transação realizada com sucesso!");
                    } else {
                        System.out.println("Falha ao realizar a transação.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
