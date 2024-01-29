package services;

import entities.Cliente;
import entities.Empresa;
import entities.Transacao;


import java.util.ArrayList;
import java.util.List;

public class BancoDados {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Empresa> empresas = new ArrayList<>();

    public boolean realizarTransacao(Transacao transacao) {
        Cliente cliente = transacao.getCliente();
        Empresa empresa = transacao.getEmpresa();
        double valor = transacao.getValor();
        String tipo = transacao.getTipo();

        if (!empresas.contains(empresa) || !clientes.contains(cliente)) {
            System.out.println("Cliente ou empresa não encontrado.");
            return false;
        }

        if (tipo.equalsIgnoreCase("depósito")) {
            empresa.depositar(valor);
            System.out.println("Depósito de " + valor + " realizado na empresa " + empresa.getNome());
        } else if (tipo.equalsIgnoreCase("saque")) {
            if (empresa.getSaldo() >= valor) {
                empresa.sacar(valor);
                System.out.println("Saque de " + valor + " realizado na empresa " + empresa.getNome());
            } else {
                System.out.println("Saldo insuficiente na empresa " + empresa.getNome());
                return false;
            }
        } else {
            System.out.println("Tipo de transação inválido.");
            return false;
        }

        return true;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public Cliente buscarClientePorCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public Empresa buscarEmpresaPorCNPJ(String cnpj) {
        for (Empresa empresa : empresas) {
            if (empresa.getCnpj().equals(cnpj)) {
                return empresa;
            }
        }
        return null;
    }

    public void atualizarSaldoEmpresa(Empresa empresa, double valorTransacao) {
        double novoSaldo;
        String tipoTransacao;
        Transacao transacao = null;
        
        if (transacao.getValor() > 0) {
            tipoTransacao = "deposito";
        } else {
            tipoTransacao = "saque";
        }
        if (tipoTransacao.equals("saque")) {
            novoSaldo = empresa.getSaldo() - valorTransacao;
        } else if (tipoTransacao.equals("deposito")) {
            novoSaldo = empresa.getSaldo() + valorTransacao;
        } else {
            throw new IllegalArgumentException("Tipo de transação inválido: " + tipoTransacao);
        }
        empresa.setSaldo(novoSaldo);
    }
}
